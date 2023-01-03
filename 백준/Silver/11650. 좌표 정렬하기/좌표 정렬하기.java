import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] k = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            k[i][0] = Integer.parseInt(st.nextToken());
            k[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(k,(e1,e2)->{
            if (e1[0] == e2[0]) {
                return e1[1]  -e2[1];
            }
            else{
                return e1[0] - e2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int[] ints : k) {
            sb.append(ints[0]).append(" ").append(ints[1]).append("\n");
        }

        System.out.println(sb);
    }
}
