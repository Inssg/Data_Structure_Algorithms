import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.substring(i);
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (String s1 : arr) {
            sb.append(s1).append("\n");
        }
        System.out.println(sb);
    }
    }
