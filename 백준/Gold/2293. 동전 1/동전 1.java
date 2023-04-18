import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// tip: each public class is put in its own file
public class Main


{
        static int[][] dp ;
        // tip: arguments are passed via the field below this editor
        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
                int n = Integer.parseInt(stk.nextToken());
                int k = Integer.parseInt(stk.nextToken());

                int[] coin = new int[n];
                int[] dp = new int[k+1];



                for(int i = 0; i < n; i++){
                        coin[i] = Integer.parseInt(br.readLine());
                }

                dp[0] =1;
                for(int i = 0; i < n; i++){
                        for(int j =1; j <= k; j++){
                                if( j >= coin[i])
                                        dp[j] += dp[j - coin[i]];
                        }
                }


                System.out.println(dp[k]);


        }

}