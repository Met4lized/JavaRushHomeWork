import java.io.*;

public class Test {


    public static void main(String[] args) throws IOException {
        StringBuilder s = new StringBuilder();
        s.append("машма").append("\n");
        s.append("dfg").append("\n");
        s.append("erhg").append("\n");
        s.append("erfvcd").append("\n");
        String data = s.toString();
        InputStream stream = new ByteArrayInputStream(data.getBytes());
        System.setIn(stream);
        readAndPrintLine();
    }

    public static void readAndPrintLine() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        while (true) {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        inputStreamReader.close();
    }
}