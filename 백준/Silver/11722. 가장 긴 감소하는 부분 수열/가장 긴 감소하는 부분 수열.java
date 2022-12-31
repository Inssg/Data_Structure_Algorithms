import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] seq;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        seq = new int[N];
        dp = new Integer[N];
        int k = 0;
        while (st.hasMoreTokens()) {
            seq[k++] = Integer.valueOf(st.nextToken());
        }
        int max = 0;
        for (int p = 0; p < N; p++) {
            LIS(p);
        }

        for (int i = 0; i < N; i++) {
            if(dp[i] > max)
                max = dp[i];
        }
        System.out.println(max);
    }

    static int LIS(int N) {
        if (dp[N] == null) {
            dp[N] = 1;

            for (int i = N - 1; i >= 0; i--) {
                if (seq[i] > seq[N]) {
                    dp[N] = Math.max(dp[N], LIS(i) + 1);
                }

            }
        }
        return dp[N];
    }
}
