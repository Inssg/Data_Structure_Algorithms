import org.w3c.dom.Node;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int E = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        if(E== 15) E =0;
        if(M == 28) M = 0;
        if(S == 19) S = 0;

        int i = 1;
        while (true) {
            if(i % 15 == E && i % 28 == M && i % 19 == S) break;
            i++;
        }
        System.out.println(i);
    }
}







