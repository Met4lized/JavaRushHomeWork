import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anton on 01.06.2015.
 */
public class Test {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str= reader.readLine();


        String s= "20";
        Integer i;
        i = Integer.parseInt(s);
        System.out.println(i);
    }
}