import java.util.Arrays;
public class Task34 {
    public static void main(String[] args){

        int[] a;
        a= new int[args.length];
        for (int j=0; j<args.length; j++)
            a[j]=Integer.valueOf(args[j]);


        Arrays.sort(a);
        String s= Arrays.toString(a);
        System.out.println(s);


    }
}
