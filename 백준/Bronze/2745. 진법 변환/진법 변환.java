import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        long max = 0;
        int t = 1;

        for (int i = a.length()-1; i >= 0; i--) {
            char c = a.charAt(i);
            if (c >= 65) {
                max += (c - 'A' + 10) *t;
            }else {
                max += (c - '0') * t;
            }
            t *= b;
        }
        System.out.println(max);


    }
}









