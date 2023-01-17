import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;


public class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;
    static Queue<Integer> q = new LinkedList<>();
    static int point, line ;
    static int count =0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         point = Integer.parseInt(st.nextToken());
         line = Integer.parseInt(st.nextToken());
         check = new boolean[point + 1];
        arr = new int[point + 1][point + 1];


        for (int i = 0; i < line; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(s.nextToken());
            int b = Integer.parseInt(s.nextToken());

            arr[a][b] = arr[b][a]=1;
        }
        for (int i = 1; i <= point; i++) {
            if (!check[i]) {
                count ++;
                bfs(i);
            }
        }

        System.out.println(count);

    }
    static void bfs(int start) {
        check[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            start = q.poll();
            for (int i = 1; i <= point; i++) {
                if (arr[start][i] == 1 & !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }

    }
    }













