import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


            while(K-- >0) {
                int result = N /2;
                int result1 =  M;
                if (result > result1) {
                 N--;
                } else if (result < result1) {
                    M--;
                }else
                    N--;
        }
        int result = N / 2 < M ? N / 2 : M;

        System.out.println(result);

    }
}