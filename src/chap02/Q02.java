package chap02;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {

        int[] a = {2,5,1,3,9,6,7};
        for(int i = 0; i < a.length /2; i++){
            System.out.println(Arrays.toString(a));
            System.out.println("a[" + i + "]과 a[" + (a.length-i-1) + "]을 교환합니다." );
            int t = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = t;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("역순 정렬을 마쳤습니다.");

    }
}
