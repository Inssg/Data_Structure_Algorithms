package chap01;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println(" b - a 값을 구합니다.");
        System.out.println("a 값:");
        int a = stdIn.nextInt();
        int b;
        do {
            System.out.println("b 값 : ");
            b = stdIn.nextInt();
            if(b <= a)
                System.out.println("a보다 큰값을 입력하세요.");
        }while(b <= a);
        System.out.println(minus(a,b));
    }
    static int minus(int a, int b){
        return b - a;
    }
}
