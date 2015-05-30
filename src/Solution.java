/**
 * Created by Anton on 27.05.2015.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* ��� �������
1. ����� � ���������� 20 �����, ������� �� � ������ � ����������� �� ��� ������ �������:
����� ������� �� 3 (x%3==0), ������� �� 2 (x%2==0) � ��� ���������.
�����, ������� ������� �� 3 � �� 2 ������������, �������� 6, �������� � ��� ������.
2. ����� printList ������ �������� �� ����� ��� �������� ������  � ����� ������.
3. ��������� ����� printList ������ ��� ��� ������ �� �����.
������� ���, ������� ��� x%3, ����� ���, ������� ��� x%2, ����� ���������.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //������ � ��������� ������ �� 20 ����
        ArrayList<Integer> list20 = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<6; i++) list20.add(Integer.parseInt(reader.readLine()));

        //������ ��� ������ ������
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list_other = new ArrayList<Integer>();

        //���������
        for (int x : list20){
            if (x % 3 == 0) list3.add(x);
            if (x % 2 == 0) list2.add(x);
            if ((x%3!=0)&&(x%2!=0)) list_other.add(x);
        }

        //��������
        printList(list3);
        printList(list2);
        printList(list_other);
    }

    public static void printList(List<Integer> list) {
        for (int x : list) System.out.println(x);
    }
}