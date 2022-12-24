import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int i = Integer.parseInt(br.readLine());
        int[] k = new int[i];
        int p = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            k[p++] = Integer.parseInt(st.nextToken());
        }
        int min =k[0];
        int max =k[0];
        for (int i1 : k) {
            if(i1 < min) min = i1;
        }
        for (int i2 : k) {
            if(i2 > max) max = i2;
        }
        
        System.out.println(min + " " + max);
    }

}
