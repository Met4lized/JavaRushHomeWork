import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader(scanner.nextLine()));
        Writer writer = new FileWriter(scanner.nextLine());
        String text;
        while ((text = br.readLine()) != null) {
            String[] data = text.split(" ");
            for (int i = 0; i < data.length; i++) {
                try {
                    writer.write(Integer.parseInt(data[i]) + " ");
                } catch (Exception e) {
                }
            }
            scanner.close();
            writer.close();
        }
    }
}