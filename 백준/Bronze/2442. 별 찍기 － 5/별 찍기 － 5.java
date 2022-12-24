import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int i = Integer.parseInt(br.readLine());
        int p = i * 2 -1;
        String s = "*";
        String s1 = " ";
        int k = 1;
        while (i > 0) {
            int t = (p - k) / 2;
            sb.append(s1.repeat(t)).append(s.repeat(k)).append("\n");
            k+=2;
            i--;
}
        System.out.print(sb);
    }
}