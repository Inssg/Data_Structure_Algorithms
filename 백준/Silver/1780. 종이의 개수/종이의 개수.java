import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(-1, 0);
        map.put(0, 0);
        map.put(1, 0);

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        split(arr,map);
        System.out.println(map.get(-1));
        System.out.println(map.get(0));
        System.out.println(map.get(1));
}

    public static Map<Integer,Integer> split(int[][] arr,Map<Integer,Integer> map) {
        //종이 안의 모든 원소가 같으면 재귀 멈추고 해당 원소의 개수 리턴

        if (arr.length == 1) {
            Integer a = map.get(arr[0][0]);
           a+=1;
            map.put(arr[0][0], a);
            return map;
        }

        boolean b = true;

        L1:
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt != arr[0][0]) {
                    b = false;
                    break L1;
                }
            }
        }

        if (!b) {
           int l = arr.length / 3;
            for (int k = 0; k < arr.length; k += l) {
                int i = 0;
                while ( i < arr.length) {
                    int[][] ints = new int[l][l];
                    for (int j = 0; j < l; j++, i++) {
                        System.arraycopy(arr[i], k, ints[j], 0, l);
                    }
                    split(ints,map);
                }
            }
        }else{
            Integer a = map.get(arr[0][0]);
            a+=1;
            map.put(arr[0][0], a);
            return map;
        }

        return map;
    }
}