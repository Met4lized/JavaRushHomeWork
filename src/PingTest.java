import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1 блин.
 * Программа должна считывать с файла имена ПК и пинговать их.
 * Далее записывать в новый файл, результаты выполнения команды пинг в ввиде (Имя ПК - результат (true/false).
 */

public class PingTest {
    public static void main(String[] args) throws IOException {
        // читаем имена ПК с файла и заполняем ими массив.
        ArrayList<String> list = new ArrayList();
        System.out.println("Укажите путь к файлу: ");
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                Scanner scanner = new Scanner(new File(reader.readLine()));
                while (scanner.hasNext()) {
                    String scan = scanner.nextLine();
                    list.add(scan);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Путь указан не верно!");
            }
            for (int i = 0; i < list.size(); i++) {
                boolean isWindows = System.getProperty("os.name").toLowerCase().contains("win");
                ProcessBuilder processBuilder = new ProcessBuilder("ping", isWindows ? "-n" : "-c", "10000", list.get(i));
                Process proc = processBuilder.start();
                System.out.println(proc);
            }
        }
    }
}
