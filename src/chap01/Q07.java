package chap01;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1 부터 n까지의 합을 구합니다.");
        System.out.println("n값 : ");
        int n = stdIn.nextInt();


        int sum = (1+n) * (n/2);
        if(n%2 == 1)
            sum += (n+1) / 2;

        System.out.println(sum);

    }
}
