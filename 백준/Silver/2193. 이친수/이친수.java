import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Long[][] dp;
    static long[]result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Long[n + 1][2];
        dp[1][0]= 1L;
        dp[1][1]= 1L;

        System.out.println(recur(n, 1));
        }

    static long recur(int at, int val) {
        if (at == 1) {
            return dp[at][val];
        }
        if(dp[at][val] == null){
            if (val == 1)
                dp[at][val] = recur(at - 1, 0);

            if (val == 0)
                dp[at][val] = recur(at - 1, 0) + recur(at - 1, 1);
        }
        return dp[at][val];
    }
        }
