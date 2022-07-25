import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder();
        Scanner s = new Scanner(System.in);

        Stack<Integer> stk = new Stack<>();

        int n = s.nextInt();
        int start = 0;


        while (n-- > 0) {
            int value = s.nextInt();

            if (value > start) {
                for (int i = start + 1; i <= value; i++) {
                    stk.push(i);
                    stb.append('+').append('\n');
                }
                start = value;

            } else if (stk.peek() != value) {
                System.out.println("NO");
                return;
            }

            stk.pop();
            stb.append('-').append('\n');

        }
        System.out.println(stb);
    }

}
