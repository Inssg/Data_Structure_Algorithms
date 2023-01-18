import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        int k = 1;
        int t =0;

        for (int i = 1; i < N; i++) {
            k *= a;
        }

        StringTokenizer num = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(num.nextToken());
            t +=  p * k;
            k /= a;
        }

        Stack<Integer> stack = new Stack<Integer>();
        while (t != 0) {
            stack.push(t % b);
            t /= b;
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

    }
    }













