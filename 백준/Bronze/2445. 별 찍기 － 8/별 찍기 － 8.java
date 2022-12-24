import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = Integer.parseInt(br.readLine());
        int p = i * 2;
        String s = "*";
        String s1 = " ";
        int k = 1;
        while (k <= i) {
            int w = p - k *2;
            sb.append(s.repeat(k)).append(s1.repeat(w)).append(s.repeat(k)).append("\n");
            k++;
        }
        k -=2;
        while (k > 0) {
            int w1 = p -k *2;
            sb.append(s.repeat(k)).append(s1.repeat(w1)).append(s.repeat(k)).append("\n");
            k--;
        }
        System.out.print(sb);
    }
}
