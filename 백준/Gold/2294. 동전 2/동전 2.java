// tip: each public class is put in its own file
import java.util.*;
import java.io.*;
public class Main
{

    static int[] dp,coin;
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        dp = new int[k+1];
        coin = new int[n];

        for(int i = 0; i < n; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        Arrays.fill(dp, (int)1e8);

        dp[0] = 0;
        for(int i = 0; i < n; i++){
            for(int j =1; j <=k ; j++){
                if(j >= coin[i])
                    dp[j] = Math.min(dp[j], dp[j-coin[i]] + 1);
            }
        }
        if(dp[k] == 1e8)
            System.out.println(-1);
        else
        System.out.println(dp[k]);
    }
}