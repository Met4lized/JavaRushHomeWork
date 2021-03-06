package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            OutputStream outputStream = new FileOutputStream("1.txt");
            InputStream inputStream = new FileInputStream("1.txt");

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy", Locale.ENGLISH);
            User user = new User();
            user.setFirstName("Петя");
            user.setLastName("Попрошайкин");
            user.setBirthDate(format.parse("29.02.2015"));
            user.setMale(true);
            user.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);
            SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy", Locale.ENGLISH);
            if (users != null) {
                for (User u : users) {
                    printWriter.println(u.getFirstName());
                    printWriter.println(u.getLastName());
                    printWriter.println(formatter.format(u.getBirthDate()));
                    printWriter.println(u.isMale());
                    printWriter.println(u.getCountry().getDisplayedName());
                }
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                User user = new User();
                user.setFirstName(line);
                user.setLastName(reader.readLine());
                Date formatter = new SimpleDateFormat("dd.mm.yyyy", Locale.ENGLISH).parse(reader.readLine());
                user.setBirthDate(formatter);
                user.setMale(Boolean.parseBoolean(reader.readLine()));
                String country = reader.readLine();
                if (country.equals("Ukraine")) {
                    user.setCountry(User.Country.UKRAINE);
                } else if (country.equals("Russia")) {
                    user.setCountry(User.Country.RUSSIA);
                } else user.setCountry(User.Country.OTHER);
                this.users.add(user);
            }
            reader.close();
        }
    }
}
