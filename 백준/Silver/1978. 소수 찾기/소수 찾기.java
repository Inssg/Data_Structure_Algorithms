import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int result = 0;
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(st.nextToken());
            if(k == 2 ||k ==3){
                result++;
                continue;
            }
            if(k == 1 || k % 2 == 0) continue;
            for (int divide = 3; divide < k; divide++) {
                if(k % divide ==0)
                    break;
                if (divide == k - 1) {
                    result++;
                }
            }


        }
        System.out.println(result);



    }
    }













