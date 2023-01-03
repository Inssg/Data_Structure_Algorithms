import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] k = new int[N];
        for (int i = N, p =0; i > 0; i--) {
            k[p++] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(k);
        StringBuilder sb = new StringBuilder();
        for (int i : k) {
           sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
