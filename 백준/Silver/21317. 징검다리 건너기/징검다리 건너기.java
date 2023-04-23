import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// tip: each public class is put in its own file
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] jump = new int[N+1][2];
        for(int i = 1; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            jump[i][0] = Integer.parseInt(st.nextToken());
            jump[i][1] = Integer.parseInt(st.nextToken());
        }
        int k = Integer.parseInt(br.readLine());

        //해당 돌에 도착하는 최소 에너지
        int[][] dp = new int[N+1][2];

        for(int i = 0; i < N+1; i++){
            dp[i][1] = (int) 1e8;
        }


            // k를 단한번만 쓸수 있음 매번 조건에 넣으면 안된다.
            // Topdown 식으로해서 비교를 따로한번더해서 어떤경우에 k를 쓰는게 베스트일지 찾아볼까?
            for(int i = 2; i <= N; i++){
                dp[i][0] = dp[i-1][0] + jump[i-1][0];
                if(i > 2) {
                    dp[i][0] = Math.min(dp[i-2][0] + jump[i-2][1], dp[i-1][0] + jump[i-1][0]);
                }
                if(i > 3) {
                    dp[i][1] = Math.min(dp[i - 3][0] + k, Math.min(dp[i - 2][1] + jump[i - 2][1], dp[i - 1][1] + jump[i - 1][0]));
                }
            }

        System.out.println(Math.min(dp[N][0],dp[N][1]));
        }

    }
