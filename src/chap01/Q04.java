package chap01;

import jdk.swing.interop.SwingInterOpUtils;

public class Q04 {
    public static void main(String[] args) {
        med3(4,2,8);

    }
    static int med3(int a, int b, int c){

                if (a >= b)
                    if (b >= c)
                        return b;
                    else if (a <= c)
                        return a;
                    else
                        return c;
                else if (a > c)
                    return a;
                else if (b > c)
                    return c;
                else
                    return b;

        }
}
