package chap01;
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n ;

        do{
            System.out.println("몇 단 삼각형 입니까?: ");
            n = stdIn.nextInt();
        }while(n <= 0);

        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);


    }
    static void triangleLB(int n){
        for(int i = 1; i <= n;i++ ){
            for(int j = 1; j <= i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    static void triangleLU(int n){
        for(int i = 1; i <= n;i++ ){
            for(int j = n; j >= i;j--)
                System.out.print("*");
            System.out.println();
        }
    }

    static void triangleRU(int n){
        for(int i = 1; i <= n;i++ ){
            System.out.print(" ".repeat(i-1));
            for(int j = n; j >= i;j--)
                System.out.print("*");
            System.out.println();
        }
    }
    static void triangleRB(int n){
        for(int i = 1; i <= n;i++ ){
            System.out.print(" ".repeat(n-i));

            for(int j = 1; j <= i;j++)
                System.out.print("*");
            System.out.println();
        }
    }

}
