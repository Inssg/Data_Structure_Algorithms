// tip: each public class is put in its own file
import java.io.*;
import java.util.*;
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws Exception
    {
        //그리디 느낌
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] dp = new int[N+1];
        int[] card = new int[N+1];
        card[0] = 0;
        dp[0] = 0;
        for(int i =1; i <= N; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }
        dp[1] = card[1];

        for(int i = 2; i <= N; i++){
            dp[i] = card[i];
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i], dp[i -j] + card[j]);
            }
        }
        System.out.println(dp[N]);
    }
}