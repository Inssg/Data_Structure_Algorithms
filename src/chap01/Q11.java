package chap01;

public class Q11 {
    public static void main(String[] args) {
        System.out.printf("%3s|", "");

            for(int k = 1; k <= 9; k++)
                System.out.printf("%3d", k);
        System.out.println();

        System.out.println("---+----------------------------");

        for(int i = 1; i <= 9; i++) {
            System.out.printf("%3d|", i);
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i * j);

            System.out.println();
        }

    }
}
