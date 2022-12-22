import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int i = Integer.parseInt(br.readLine());
        String str;
        int k = 1;
        while (i>0) {
            str = br.readLine();
             st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(k++).append(": ").append(a + b).append("\n");
            i--;
        }
        System.out.println(sb);
        }
    }
