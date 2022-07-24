package chap06;

import java.util.Scanner;

public class Q5 {
    // a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //버블 정렬
    static void bubbleSort(int[]a, int n){
        int w =1;
        int k = 0;


        if(w % 2 == 1) {
            while (k < n - 1) {
                int last = n - 1;
                for (int j = n - 1; j > k; j--)
                    if (a[j - 1] > a[j]) {
                        swap(a, j - 1, j);
                        last = j;
                    }
                k = last;
            }

        }
        if(w % 2 == 0){
             k = n -1;
            int last = 0;
            for(int j = 0; j < k ; j++)
                if(a[j] > a[j+1]) {
                    swap(a, j, j + 1);
                    last = j;
                }
                k = last;
        }
        w++;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }
        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for ( int i =0; i < nx; i ++)
            System.out.println("x[" + i +"] =" + x[i]);
    }
}
