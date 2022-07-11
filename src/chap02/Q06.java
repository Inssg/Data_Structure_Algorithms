package chap02;

import java.util.Scanner;

public class Q06 {
    //정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수를 반환
    static int cardConv(int x, int r, char[]d) {
        int digits = 0;
        int n = ((Integer)x).toString().length();
        String dchar ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf(String.format("%%2d | %%%dd\n", n),r,x);

        do {
            System.out.print("   +");
            for (int i = 0; i < n + 2; i++) {
                System.out.print("-");
            }
            System.out.println();

            if (x / r != 0)
                System.out.printf(String.format("%%2d | %%%dd      ...%%d\n", n), r, x / r, x % r);
            else
                System.out.printf(String.format("       %%%dd       ...%%d", n), x / r, x % r);
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }while(x != 0);



        for(int i =0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - i -1];
            d[digits -i -1] = t;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.println("변환하는 음이 아닌 정수: ");
                no = stdIn.nextInt();

            }while (no < 0);
        do {
            System.out.println("어떤 진수로 변환할까요? (2~36): ");
            cd = stdIn.nextInt();
        }while(cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.print(cd + "진수로");
            for(int i = 0; i < dno; i++)
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1..예/0..아니요): ");
            retry = stdIn.nextInt();
        }while (retry == 1);
    }
}
