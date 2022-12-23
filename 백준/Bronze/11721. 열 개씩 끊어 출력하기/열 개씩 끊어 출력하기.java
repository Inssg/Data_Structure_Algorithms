import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        int i= 0;

        for (; i+10 < s.length(); i += 10) {
            sb.append(s.substring(i, i + 10)).append("\n");
        }

        sb.append(s.substring(i, s.length()));


        System.out.println(sb);
    }

}
