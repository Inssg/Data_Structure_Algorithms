package chap01;

public class Q02 {
    static int min3(int a, int b, int c) {
        int min = a;
        if( b < min)
           min = b;
        if( c < min)
            min = c;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min3(2,4,1));
        System.out.println(min3(4,0,3));
        System.out.println(min3(7,4,6));
    }
}
