// tip: each public class is put in its own file

import java.util.*;
import java.io.*;

public class Main {
    static int[][] dp;
    static int N;
    static boolean[][] visited;
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {1, -1, 0, 0};
    static int nowX, nowY;
    static int num;
    static int answer = Integer.MAX_VALUE;

    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        num = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && dp[i][j] !=0) {
                    num++;
                    bfs(i, j);
                }
            }
        }

        //섬의 개수 는 num - 1
        //다른 섬을 만날때까지의 최단 거리
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(dp[i][j] >=2){
                    visited = new boolean[N][N];
                    bridge(i,j);
                }
            }
        }
        System.out.println(answer);

    }

    //bfs 돌면서 섬에다가 2부터 번호를 매긴다
    //해당 섬에서 다른 섬까지 가는 경우의 수 중 최소값을 리턴하면된다.

    static void bfs(int x, int y) {
        Queue<spot> q = new LinkedList<>();
        q.offer(new spot(x, y,0));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            spot s = q.poll();
            
            dp[s.x][s.y] = num;
            for (int i = 0; i < 4; i++) {
                nowX = s.x + dirX[i];
                nowY = s.y + dirY[i];

                if (check() && !visited[nowX][nowY] && dp[nowX][nowY] == 1) {
                    visited[nowX][nowY] = true;
                    q.offer(new spot(nowX, nowY,0));
                }
            }
        }
    }

    static void bridge(int x, int y){
        Queue<spot>que = new LinkedList<>();
        que.offer(new spot(x, y, 0));
        int cur = dp[x][y];
        visited[x][y] = true;
        while(!que.isEmpty()){
            spot st = que.poll();
            for(int i = 0; i < 4; i++){
                nowX = st.x + dirX[i];
                nowY = st.y + dirY[i];

                if(check() && !visited[nowX][nowY] && dp[nowX][nowY] != cur){
                    visited[nowX][nowY] = true;
                    if(dp[nowX][nowY] == 0){
                        que.offer(new spot(nowX, nowY, st.count + 1));
                    } else {
                        answer = Math.min(answer, st.count);
                    }
                }
            }
        }

    }

    static boolean check() {
        return nowX >= 0 && nowX < N && nowY >= 0 && nowY < N;
    }

    static class spot {
        int x;
        int y;
        int count;

        public spot(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }


}
