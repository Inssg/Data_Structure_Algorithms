package chap01;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("양의 정수값의 자릿수를 구합니다.");
        int n;

        do {
            System.out.println("숫자를 입력하세요");
            n = stdIn.nextInt();
        }while(n  <= 0);

        System.out.println("그 수는 "+ten(n)+ "자리입니다.");

    }
    static int ten(int a){



        int count = 0;

        while(a > 0){
            a = a /10;
            count++;
        }
       return count;
    }
}
