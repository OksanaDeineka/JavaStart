import java.util.Scanner;

public class Task22 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer:");
        int i = scanner.nextInt();
        System.out.print("Enter integer:");
        int b = scanner.nextInt();
        int r = i+b;
        System.out.println(r);
        int g = i-b;
        System.out.println(g);
        double f = b/i;
        System.out.println(f);
        int h = b*i;
        System.out.println(h);
        int m = i%b;
        System.out.println(m);
        int lo = b*b;
        System.out.println(lo);
        int q = i+b;
        int li = q%i;
        System.out.println(li);


    }

}