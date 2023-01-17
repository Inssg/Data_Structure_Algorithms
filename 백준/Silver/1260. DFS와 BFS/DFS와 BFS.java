import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;


public class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;
    static Queue<Integer> q = new LinkedList<>();
    static int point, line, start;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         point = Integer.parseInt(st.nextToken());
         line = Integer.parseInt(st.nextToken());
         start = Integer.parseInt(st.nextToken());
         check = new boolean[point + 1];


        arr = new int[point + 1][point + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(s.nextToken());
            int b = Integer.parseInt(s.nextToken());

            arr[a][b] = arr[b][a]=1;
        }

        dfs(start);
        sb.append("\n");
        check = new boolean[point + 1];
        bfs(start);

        System.out.println(sb);


    }

    static void dfs(int start) {
        check[start] =true;
        sb.append(start + " ");

        for (int i = 0; i <= point; i++) {
            if(arr[start][i] == 1 && !check[i])
                dfs(i);
        }
    }

    public static void bfs(int start) {
        q.add(start);
        check[start] = true;

        while (!q.isEmpty()) {

            start = q.poll();
            sb.append(start + " ");

            for (int i = 1; i <= point; i++) {
                if (arr[start][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }}









