package com.javarush.test.level18.lesson10.home10;

/* �������� ����
�������� ���� �� ��������
��������� � ������� ����� ������
������ ���� ����� ���: [someName].partN. ��������, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
����� ������ �������� � ������������ �������. ���� ������������� ������ "end"
� �����, ��� ��������� ��� ���������� �����, ������� ���� ��� ��������� [.partN]. ��������, Lion.avi
� ���� ���������� ��� ����� �� ������-������ ��������� �����.
����� ������������ � ������� ������������������, ������� ������ �����, ����� ������, ..., � ����� - ���������.
������� ��� ������ �����-������
�������� ����� ��������� ������, �.�. �� ������� ������������� ����������� �������� ����� ���� ������
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