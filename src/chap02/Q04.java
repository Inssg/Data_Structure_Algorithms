package chap02;

import java.util.Arrays;

public class Q04 {
   static void copy(int[] a,int[] b){
       b = a.clone();
       System.out.println(Arrays.toString(b));
   }

    public static void main(String[] args) {
        int[] a = {1,2,6,7,8,3};
        int[] b = new int[]{};

        copy(a, b);


    }
}
