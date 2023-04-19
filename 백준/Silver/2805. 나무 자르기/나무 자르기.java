import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// tip: each public class is put in its own file
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] tree = new int[N];

        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int max = 0;
        for(int i= 0; i < N; i++){
            tree[i] =  Integer.parseInt(stk.nextToken());
            if(tree[i] > max) max = tree[i];
        }
        int min = 0;

        while(min < max){
            int mid = (min + max) / 2 ;
             long len = 0;

            for(int i = 0; i < N; i++){
                if((tree[i]- mid) <= 0 ) continue;
                len +=  tree[i] - mid;
            }

            if(len < M){
                max = mid;
            }else{
                min = mid + 1;
            }
        }

        int answer = min -1;


        System.out.println(answer);
    }
}