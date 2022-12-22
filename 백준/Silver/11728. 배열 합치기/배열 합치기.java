import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = a +b;
        String s = br.readLine();
        String s1 = br.readLine();
        String s2 = s + " " + s1;

        StringTokenizer st1 = new StringTokenizer(s2, " ");
        int[] i = new int[c];
        int k = 0;
        while (st1.hasMoreTokens()) {
            i[k++] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(i);
        for (int i1 : i) {
            sb.append(i1).append(" ");
        }
        sb.delete(c + c - 1, c + c - 1);
        System.out.println(sb);
    }

}
