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
        int p = i * 2 - 1;
        int k = 1;
        int w = 1;
        // i - k ; , w =0부터해서  2개씩증가

        sb.append(s1.repeat(i - k)).append(s).append(s1.repeat(w)).append("\n");
        k++;
        while (k < i) {
            sb.append(s1.repeat(i - k)).append(s).append(s1.repeat(w)).append(s).append("\n");

            k++;
            w+=2;
        }
        if(i != 1)
        sb.append(s.repeat(p));

        System.out.print(sb);
    }
}