import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = Integer.parseInt(br.readLine());
        String s = "*";
        String s1 = " ";
        String s2 = " *";
        int p = i * 2 -1;
        int k = 1;
        int o = 0;
        while (k <= i) {
            sb.append(s1.repeat(i - k)).append(s).append(s2.repeat(o)).append("\n");
            k++;
            o++;
        }

        System.out.print(sb);
    }
}