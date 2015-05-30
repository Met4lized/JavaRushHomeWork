package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть все потоки ввода-вывода
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> partNumber = new TreeMap<>();
        FileInputStream fileReader = null;
        FileOutputStream fileWriter = null;
        String filePartName = null;
        String fileName = null;
        File file;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            while (!(filePartName = reader.readLine()).equals("end")) {
                file = new File(filePartName);
                String[] line;
                if(file.exists()){
                    line = filePartName.split("\\.");
                    partNumber.put(Integer.parseInt(line[2].substring(5)),filePartName);
                } else{
                    throw new FileNotFoundException();
                }
                fileName = String.format("%s.%s",line[0], line[1]);
                if (!new File(fileName).exists()){file.createNewFile();}
            }

            for (Map.Entry<Integer, String> integerStringEntry : partNumber.entrySet()) {
                fileReader = new FileInputStream(integerStringEntry.getValue());
                fileWriter = new FileOutputStream(fileName,true);
                byte[] buffer = new byte[fileReader.available()];
                while(fileReader.available() > 0){
                    fileReader.read(buffer);
                    fileWriter.write(buffer);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            fileWriter.close();
            fileReader.close();
        }
    }
}