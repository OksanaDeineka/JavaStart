public class Task41 {
    public static void main(String[] args) {
        int x = 10;

        while (x < 20) {
            System.out.println(x);
            x++;
        }
        do {
            System.out.println(x);
            x++;
        }
        while (x < 20);

        for (x = 10; x < 20; x++) ;
        {
            System.out.println(x);
        }

        int nums[] = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        for (int i : nums) {
            System.out.println("Number String: " + i);
        }
    }
}
