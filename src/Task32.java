import sun.awt.geom.AreaOp;

import java.util.Arrays;

public class Task32 {
    public static void main(String[] args){
        int [] n = {5,4,3,2,1};
        int t= n[0];
       n[0]=n[n.length-1];
       n[n.length-1]=t;
       System.out.println(Arrays.toString(n));

    }


}