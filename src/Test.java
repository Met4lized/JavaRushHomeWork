import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {


    public static void main(String[] args) throws Exception {
        Map<Integer, String> map = new TreeMap<>();
    }

    public static Map<Integer, String> fillMap(Map<Integer, String> map) {
        int id = 0;
        try (Scanner scanner = new Scanner(System.in); BufferedReader reader = new BufferedReader(new FileReader(scanner.nextLine()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                map.put(id++,line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}