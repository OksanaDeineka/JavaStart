import java.util.Scanner;

public class Task21 {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Net string:");
        String s = scanner.nextLine();

        System.out.print("Net string:");
        String w = scanner.nextLine();

        System.out.print("Net string:");
        String k = scanner.nextLine();

        String lo = s+k;
        String li = k+w+s;
        String la = s+w+k;

        System.out.println(lo);
        System.out.println(li);
        System.out.println(la);
}
}
