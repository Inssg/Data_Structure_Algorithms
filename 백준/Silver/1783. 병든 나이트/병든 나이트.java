import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main
{
    static int N,M;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        int count = 0;
        
        if(N==1) count = 0;
        else if(N == 2) count = Math.min(3, (M-1) /2);
        else if(M < 7){
            count= Math.min(3, M-1);
        }
        else count = 4 + M -7;

        count++;
        System.out.println(count);

    }


}