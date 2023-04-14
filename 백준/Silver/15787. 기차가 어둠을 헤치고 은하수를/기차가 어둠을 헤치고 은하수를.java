// tip: each public class is put in its own file
import java.io.*;
import java.util.*;
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N =  Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] train = new int[N][20];

        while(M--> 0){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            int k = 0;
            while(stk.hasMoreTokens()){
                arr[k++] = Integer.parseInt(stk.nextToken());
            }
            if( arr[0] == 1){
                train[arr[1]-1][arr[2]-1] = 1;
            }else if(arr[0] == 2){
                train[arr[1]-1][arr[2]-1] = 0;
            }else if(arr[0] == 3){
                int[] tmp = new int[20];
                for(int i = 0 ; i < 19; i++){
                    if(train[arr[1]-1][i] == 1)
                        tmp[i+1] = 1;
                }
                train[arr[1]-1] = tmp;
            }else {
                int[] tmp = new int[20];
                for(int i = 1; i < 20; i++){
                    if(train[arr[1]-1][i] == 1)
                        tmp[i-1] = 1;
                }
                train[arr[1]-1] = tmp;
            }
        }
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            String s = "";
            for(int j = 0 ; j < 20 ; j++){
                s += train[i][j];
            }
            if(!list.contains(s))
                list.add(s);
        }
        System.out.println(list.size());
    }
}
