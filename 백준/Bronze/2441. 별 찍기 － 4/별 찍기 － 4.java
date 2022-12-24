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
        for (int k = 0; i> 0; k++,i--) {
            sb.append(s1.repeat(k)).append(s.repeat(i)).append("\n");
        }
        System.out.println(sb);
    }
}