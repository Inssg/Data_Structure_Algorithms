package chap02;

public class Q03 {
    static int sumOf(int[] a) {

        int sum = 0;
        for (int b : a)
            sum += b;

        return sum;
    }

    public static void main(String[] args) {
        int[] c = {1,2,6,7,8,3};
        System.out.println(sumOf(c));
    }
}
