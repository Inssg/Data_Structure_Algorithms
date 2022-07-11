package chap01;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a와 b 사이의 모든 정수의 합을 구합니다.");
        System.out.println("a값: ");
        int a = stdIn.nextInt();
        System.out.println("b값: ");
        int b = stdIn.nextInt();

        System.out.println(sumof(a,b));
    }
    static int sumof(int a, int b){
        int start = a;
        int end = b;

        if(a > b) {
            start = b;
            end = a;
        }
        int sum = 0;

        for(int i = start; i <= end; i++){
                sum += i;
        }
       return sum;

    }
}
