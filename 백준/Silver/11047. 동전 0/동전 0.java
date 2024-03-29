import org.w3c.dom.Node;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int count =0;
        int[] coin = new int[N];
        for (int i = N-1; i >= 0; i--) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            if(money < coin[i]) continue;
            count += money / coin[i];
            money %= coin[i];
        }
        System.out.println(count);
    }
}







