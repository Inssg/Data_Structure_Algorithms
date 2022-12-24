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
        for (int k = 1; k <= i; k++) {
            sb.append(s.repeat(k)).append("\n");
        }
        System.out.println(sb);
    }

}

