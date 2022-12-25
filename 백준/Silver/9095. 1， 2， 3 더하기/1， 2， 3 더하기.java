import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(br.readLine());

        while (k > 0) {
            int p = Integer.parseInt(br.readLine());
            int[] dp = new int[100];
            dp[1]=1;
            dp[2]=2;
            dp[3]= 4;
            for (int i = 4; i < p +1; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            sb.append(dp[p]).append("\n");
            k--;
        }


        System.out.println(sb);

    }
}
