/**
 * Created by Anton on 27.05.2015.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* “ри массива
1. ¬веди с клавиатуры 20 чисел, сохрани их в список и рассортируй по трЄм другим спискам:
„исло делитс€ на 3 (x%3==0), делитс€ на 2 (x%2==0) и все остальные.
„исла, которые дел€тс€ на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. ћетод printList должен выводить на экран все элементы списка  с новой строки.
3. »спользу€ метод printList выведи эти три списка на экран.
—начала тот, который дл€ x%3, потом тот, который дл€ x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //создаЄм и заполн€ем список на 20 цифр
        ArrayList<Integer> list20 = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<6; i++) list20.add(Integer.parseInt(reader.readLine()));

        //создаЄм три других списка
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list_other = new ArrayList<Integer>();

        //сортируем
        for (int x : list20){
            if (x % 3 == 0) list3.add(x);
            if (x % 2 == 0) list2.add(x);
            if ((x%3!=0)&&(x%2!=0)) list_other.add(x);
        }

        //печатаем
        printList(list3);
        printList(list2);
        printList(list_other);
    }

    public static void printList(List<Integer> list) {
        for (int x : list) System.out.println(x);
    }
}