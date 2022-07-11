package chap01;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정사각형을 출력합니다.");

        int n;
        do {
            System.out.println("변의 길이:");
            n = stdIn.nextInt();
        } while (n <= 0);


        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
