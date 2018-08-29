import java.util.Arrays;
import java.util.Scanner;

public class Task033 {
    public static void main (String[] args){
        Scanner ko = new Scanner(System.in);
        int [] a = new int[4];

        a[0]= ko.nextInt();
        a[1]= ko.nextInt();
        a[2]= ko.nextInt();
        a[3]= ko.nextInt();

        int len = a.length;// функция указывает на длину масива= количество элементов
        System.out.println(len);

        //int [] c1 = Arrays.copyOf(a, a.length);
        //System.out.println(c1);

        int [] c2 = Arrays.copyOf(a,2);// функция которыя выводит первую половину масива
        String s1 = Arrays.toString(c2);
        System.out.println(s1);

        int [] c3 = Arrays.copyOfRange(a,2,4);// функция которая выводит вторую половину масива
        String s2 = Arrays.toString(c3);
        System.out.println(s2);
    }
}