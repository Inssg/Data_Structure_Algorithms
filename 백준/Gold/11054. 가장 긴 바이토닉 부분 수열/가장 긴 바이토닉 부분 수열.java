import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int[] seq;
    static Integer[] dp;
    static Integer[]  q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        seq = new int[N];
        dp = new Integer[N];
        q = new Integer[N];
        int k = 0;
        while (st.hasMoreTokens()) {
            seq[k++] = Integer.valueOf(st.nextToken());
        }
//        int max = 0;
//        ArrayList<Integer> index = new ArrayList<>();
//        ArrayList<Integer> result = new ArrayList<>();
//        for (int i : seq) {
//            if(i > max)
//                max = i;
//        }
//        for (int i = 0; i < N; i++) {
//            if (seq[i] == max) {
//                index.add(i);
//            }
//        }

            for (int i = 0; i < N; i++) {

                LIS(i);
                BIS(i);
//                result.add(dp[a] + q[a]-1);
            }
//        Collections.sort(result,Collections.reverseOrder());
        int max = -1;
        for (int i = 0; i < N; i++) {
            max = Math.max(dp[i] + q[i], max);
        }
        System.out.println(max-1);
        }


    static int LIS(int N) {
        if (dp[N] == null) {
            dp[N] = 1;

            for (int i = N - 1; i >= 0; i--) {
                if (seq[i] < seq[N]) {
                    dp[N] = Math.max(dp[N], LIS(i) + 1);
                }
            }
            }
        return dp[N];
        }

    static int BIS(int L) {
        if (q[L] == null) {
            q[L]  =1;

            for (int i = L + 1; i < q.length; i++) {
                if (seq[i] < seq[L]) {
                    q[L] = Math.max(q[L], BIS(i) + 1);
                }
            }
        }
        return q[L];
    }
    }
