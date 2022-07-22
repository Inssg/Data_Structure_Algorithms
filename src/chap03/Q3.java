package chap03;

import java.util.Arrays;

public class Q3 {
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int i = 0;
        int j = 0;

        while (i < n) {
            if (a[i] == key) {
                idx = Arrays.copyOf(idx, idx.length + 1);
                idx[idx.length - 1] = i;
            }
            i++;
        }
        return idx.length;
    }

    public static void main(String[] args) {
        int[] a = {1, 9,2,9, 4, 6, 7, 9,0,9};
        int[] b = new int[]{};

        System.out.println(searchIdx(a,10,9,b));
    }
}


