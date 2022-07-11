package chap01;
import java.util.Scanner;

public class SumVerbose2 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합ㄴ디ㅏ.");

        do {
            System.out.println("n값 : ");
            n = stdIn.nextInt();
        }while (n <= 0);

        int sum = 0;

        for(int i = 1; i < n; i ++) {
            System.out.println(i + " + ");
            sum += i;
        }
        System.out.println(n + " = ");
        sum += n;
        System.out.println(sum);

    }
}
