import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int k = 0;
        int p = 0;
        String s = br.readLine();
        while (i > k) {
            Integer a = Integer.valueOf(s.charAt(k++))-48;
            p += a;
        }
        System.out.println(p);
    }

}
