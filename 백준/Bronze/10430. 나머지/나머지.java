import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[3];


        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();

        sb.append((arr[0] + arr[1]) % arr[2]).append("\n")
                .append((arr[0] % arr[2] + arr[1] % arr[2]) % arr[2]).append("\n")
                .append((arr[0] * arr[1]) % arr[2]).append("\n")
                .append(((arr[0] % arr[2]) * (arr[1] % arr[2])) % arr[2]).append("\n");
        System.out.println(sb);
    }

    }