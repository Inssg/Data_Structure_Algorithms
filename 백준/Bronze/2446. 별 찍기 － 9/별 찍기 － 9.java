import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = Integer.parseInt(br.readLine());
        String s = "*";
        String s1 = " ";

        int w = 0;
        while (i > 0) {
            int p = i * 2 -1;
            sb.append(s1.repeat(w)).append(s.repeat(p)).append("\n");
            w ++;
            i--;
        }
        i +=2;
        w -=2;
        while (w >= 0) {
            int p1 = i * 2 -1;
            sb.append(s1.repeat(w)).append(s.repeat(p1)).append("\n");
            w--;
            i++;
        }
        System.out.print(sb);
    }
}