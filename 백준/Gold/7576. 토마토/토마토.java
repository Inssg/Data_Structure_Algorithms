
import java.util.*;
import java.io.*;


class Main {
    static int[][] dp ;
    static boolean[][] visited;
    static int[] dirX = {0, 1, 0, -1};
    static int[] dirY = {1, 0, -1, 0};
    static int nowX,nowY;
    static Queue<spot> que;
    static int N, M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        dp = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                dp[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        
        que = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if ( dp[i][j] == 1)
                    que.add(new spot(i, j));
            }
        }
        bfs();

        int max = 0;
        label:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dp[i][j] == 0) {
                    max = -1;
                    break label;
                }
                if(max < dp[i][j]) max = dp[i][j];
            }
        }
        if (max == -1) {
            System.out.println(-1);
        }else
            System.out.println(max-1);
    }

        //bfs
    private static void bfs() {
        

        while (!que.isEmpty()) {
            spot q = que.poll();
            visited[q.x][q.y] = true;
            for (int i = 0; i < 4; i++) {

                nowX = q.x + dirX[i];
                nowY = q.y + dirY[i];

                if (check() && !visited[nowX][nowY] && dp[nowX][nowY] == 0) {
                    que.add(new spot(nowX, nowY));
                    visited[nowX][nowY] = true;
                        dp[nowX][nowY] =  dp[q.x][q.y] +1;
                }
            }
        }


    }

    static boolean check() {
        return nowX >= 0 && nowX < N && nowY >= 0 && nowY < M;
    }

    static class spot {
        int x;
        int y;

        public spot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


}