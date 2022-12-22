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
            String s = st.nextToken();
            String s1 = st.nextToken();
            int a = Integer.parseInt(s);
            int b = Integer.parseInt(s1);
            sb.append("Case #").append(k++).append(": ").append(s + " + " + s1 + " = ").append(a + b).append("\n");
            i--;
        }
        System.out.println(sb);
        }
    }
