// tip: each public class is put in its own file
import java.io.*;
import java.util.*;
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int[] bulb = new int[N];

        for(int i = 0; i < N ; i++){
            bulb[i] = Integer.parseInt(st1.nextToken());
        }

        int[][] k = new int[M][3];

        for(int i = 0 ; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 3; j++){
                k[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for(int i = 0; i < M; i++){
            if(k[i][0] == 1){
                bulb[k[i][1]-1] = k[i][2];
            }else if(k[i][0] == 2){
                for(int j = k[i][1] -1; j < k[i][2]; j++){
                    if(bulb[j] == 0)
                        bulb[j] = 1;
                    else
                        bulb[j] = 0;
                }
            }else if(k[i][0] == 3){
                for(int j = k[i][1] -1; j < k[i][2]; j++){
                    bulb[j] = 0;
                }

            }else{
                for(int j = k[i][1] -1; j < k[i][2]; j++){
                    bulb[j] = 1;
                }
            }
        }
       for(int w : bulb){
           System.out.print(w + " ");
       }
    }


}
