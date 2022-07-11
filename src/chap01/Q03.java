package chap01;

public class Q03 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min4(2, 4, 1, 5));
        System.out.println(min4(4, 0, 3, 9));
        System.out.println(min4(7, 4, 6, 7));
    }
}
