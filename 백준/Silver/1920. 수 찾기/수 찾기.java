import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(stk.nextToken());

          int result = binarySearch(key, arr) == true ? 1 : 0;
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }

    public static boolean binarySearch(int key, int[] arr) {
        int min = 0;
        int max = arr.length-1;


        while (min <= max) {
            int mid = (min + max) /2;
            if (key < arr[mid]) {
                max = mid-1;
            } else if (key > arr[mid]) {
                min = mid + 1;
            } else
                return true;
        }
        return  false;
    }
    }