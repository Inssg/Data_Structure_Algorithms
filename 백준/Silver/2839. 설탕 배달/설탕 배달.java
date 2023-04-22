import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// tip: each public class is put in its own file
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];

        if (N < 3)
            System.out.println(-1);
        else if (N == 4)
            System.out.println(-1);
        else if (N == 3 || N == 5)
            System.out.println(1);
        else {
            dp[0] = -1;
            dp[1] = -1;
            dp[2] = -1;
            dp[3] = 1;
            dp[4] = -1;
            dp[5] = 1;
            for (int i = 6; i <= N; i++) {
                if (dp[i - 3] == -1 && dp[i - 5] == -1)
                    dp[i] = -1;
                else if (dp[i - 3] != -1 && dp[i - 5] == -1)
                    dp[i] = dp[i - 3] + 1;
                else if (dp[i - 3] == -1 && dp[i - 5] != -1)
                    dp[i] = dp[i - 5] + 1;
                else
                    dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;

            }

            System.out.println(dp[N]);
        }
    }
}