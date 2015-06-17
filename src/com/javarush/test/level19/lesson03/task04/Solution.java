package com.javarush.test.level19.lesson03.task04;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1978

Подсказка: воспользуйтесь классом Calendar
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("E:\\JavaRushHomeWork\\file.txt"));
        PersonScanner adapter = new PersonScannerAdapter(s);
        System.out.println(adapter.read());
        adapter.close();
    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner scanner;

        PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String data = scanner.nextLine();
            String[] line = data.split(" ");
            String firstName = line[1];
            String middleName = line[2];
            String lastName = line[0];
            int dd = Integer.parseInt(line[3]);
            int mm = Integer.parseInt(line[4]);
            int yy = Integer.parseInt(line[5]);
            Calendar calendar = new GregorianCalendar(Integer.parseInt(line[5]), Integer.parseInt(line[4]) - 1, Integer.parseInt(line[3]));
            Date birthDate = calendar.getTime();
            Person person = new Person(firstName, middleName, lastName, birthDate);

            return person;
        }

        @Override
        public void close() throws IOException {
            scanner.close();
        }
    }
}
