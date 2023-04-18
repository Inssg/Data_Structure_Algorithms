import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// tip: each public class is put in its own file
public class Main

     
{
// tip: arguments are passed via the field below this editor
static int[][] dp ;
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(T-- > 0){
        dp = new int[30][30];
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        sb.append(combination(M,N)).append("\n");
        }

        System.out.println(sb);


        }
public static int combination(int n, int r){
        if(dp[n][r] > 0){
        return dp[n][r];
        }

        if(n == r || r == 0){
        return dp[n][r] =1;
        }

        return dp[n][r] = combination(n-1,r-1) + combination(n-1,r);
        }
        }