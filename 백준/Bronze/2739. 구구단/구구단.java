import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for (int k = 1; k <=9; k++) {
            sb.append(i).append(" * ").append(k).append(" = ").append(i * k).append("\n");
        }
        System.out.println(sb);
    }

}
