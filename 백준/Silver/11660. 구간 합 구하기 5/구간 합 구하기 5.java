import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// tip: each public class is put in its own file
public class Main
{
    static StringTokenizer st;
    static  int[][] dp;
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        dp = new int[N+1][N+1];
        int[][] arr = new int[N+1][N+1];
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N ; i++){
             st = new StringTokenizer(br.readLine()," ");
            for(int j = 1; j <= N; j++){
                arr[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <= N; i++){
            for(int j =1; j <=N; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1] -dp[i-1][j-1] + arr[i][j];
            }
        }

        for(int k = 1; k <= M; k++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int ans =  dp[x2][y2] - dp[x2][y1-1] -dp[x1-1][y2] +dp[x1-1][y1-1];
            sb.append(ans + "\n");
        }

        System.out.println(sb);
    }

}
