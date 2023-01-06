import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        int[][] k = new int[m][2];
        int l = 0;


        while (m > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            k[l][0] =Integer.parseInt(st.nextToken());
            k[l][1] = Integer.parseInt(st.nextToken());
            l++;
            m--;
        }
        Arrays.sort(k, (e1, e2) -> {
            if (e1[1] == e2[1]) {
                return e1[0] - e2[0];
            } else
                return e1[1] - e2[1];
        });
        for (int[] ints : k) {
            sb.append(ints[0]).append(" ").append(ints[1]).append("\n");
        }
        System.out.println(sb);
    }
}
