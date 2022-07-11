package chap01;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        do {
            System.out.println("n단의 피라미드를 출력합니다. n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);
    spira(n);

    }
    static void spira(int n){
        for(int i =1; i <= n; i++){
            System.out.print(" ".repeat(n-i));
            System.out.print("*".repeat((i-1)*2 +1));
            System.out.println(" ".repeat(n-i));
        }

    }
}
