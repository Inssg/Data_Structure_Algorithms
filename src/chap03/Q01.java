package chap03;

import java.util.Scanner;

public class Q01 {
    static int seqSearchSen(int[] a, int n, int key) {

            int i = 0;
            a[n] = key;

            for(;true;i++) {
                if(a[i] == key)
                    break;
            }
          /*  while(true) {
                if(a[i] ==key)
                    break;
                i++;
            }*/
            return i == n? -1 : i;
        }

        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);

            System.out.println("요솟수: ");
            int num = stdIn.nextInt();
            int[] x = new int[num + 1];

            for(int i = 0; i < num; i++) {
                System.out.println("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            }
            System.out.println("검색할 값");
            int ky =stdIn.nextInt();

            int idx = seqSearchSen(x, num, ky);

            if( idx == -1)
                System.out.println("그값의 요소가 없습니다.");
            else
                System.out.println("그값은 x[" + idx + "]에 있습니다.");
        }
    }


