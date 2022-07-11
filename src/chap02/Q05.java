package chap02;

import java.util.Arrays;

public class Q05 {
   static void rcopy(int[] a,int[] b){
       b = a.clone();
       for(int i = 0; i < b.length/2; i++){
           int t = b[i];
           b[i] = b[b.length -i -1];
           b[b.length -i -1] = t;
       }

       System.out.println(Arrays.toString(b));
   }

    public static void main(String[] args) {
        int[] a = {1,2,6,7,8,3};
        int[] b = new int[]{};


        rcopy(a, b);


    }
}
