import java.util.Scanner;

public class Task22 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer:");
        int i = scanner.nextInt();
        System.out.print("Enter integer:");
        int b = scanner.nextInt();
        System.out.print("Enter integer:");
        int c = scanner.nextInt();
        int r = i+b+c;
        System.out.println(r);
        int g = i-b;
        System.out.println(g);
        double f = b/i;
        System.out.println(f);
        int h = b*i;
        System.out.println(h);
        int m = i%b;
        System.out.println(m);

    }

}