
import java.util.*;
import java.io.*;


class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, (o1, o2) -> {
            return o1[1]==o2[1]?o1[0]-o2[0]:o1[1] - o2[1];
        });
        int count = 1;
        int end = arr[0][1];

        for (int i = 1; i < N; i++) {
            if (arr[i][0] >= end) {
                end = arr[i][1];
                count++;
            }
        }

        System.out.println(count);

    }

}