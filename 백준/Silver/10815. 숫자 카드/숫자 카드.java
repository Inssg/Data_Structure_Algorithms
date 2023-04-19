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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] card = new int[N];

        for(int i = 0; i < N; i++){
            card[i] =  Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        int[] have = new int[M];
        int[] answer = new int[M];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M ; i++ ){
            have[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(card);
        StringBuilder sb =new StringBuilder();

        for(int k : have){
            boolean b = binarySearch(k , card);
            if(b) sb.append("1 ");
            else sb.append("0 ");
        }

        System.out.println(sb);
    }
    public static boolean binarySearch(int k , int[] card){
        int lo = 0;
        int hi = card.length -1;

        while(lo <= hi){
            int mid = (lo + hi) / 2;

            if(k < card[mid])
                hi = mid -1;
            else if (k > card[mid])
                lo = mid + 1;
            else
                return true;
        }
        return false;


    }
}