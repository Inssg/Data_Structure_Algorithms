import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] dp;
    static long[]result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        result = new long[k+1];
        dp = new int[k + 1][10];
        for (int i = 0; i < 10; i++) {
            dp[1][i] =1;
        }
        result[1] = 10;
        for (int i = 2; i <= k; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                }
                else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    dp[i][j] %= 10007;
                }
                result[i] += dp[i][j];
            }
        }

        System.out.println(result[k] %10007);
        }
        }
