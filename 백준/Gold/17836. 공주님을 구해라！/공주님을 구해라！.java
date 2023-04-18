import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// tip: each public class is put in its own file
public class Main {
    static int[][] dp;
    static boolean[][][] visited;
    static int[] dirX = {0, 0, 1, -1};
    static int[] dirY = {1, -1, 0, 0};
    static int nowX, nowY;
    static int N, M, T;


    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        T = Integer.parseInt(stk.nextToken());


        dp = new int[N][M];
        visited = new boolean[N][M][2]; // 0은그람이 없을때, 1은 그람이 있을때
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }


       int result = bfs(0, 0);
        if(result == -1)
            System.out.println("Fail");
        else System.out.println(result);

    }

    public static int bfs(int x, int y) {
        Queue<spot> q = new LinkedList<>();
        q.add(new spot(x, y,0,false));
        visited[x][y][0] =true;

        while (!q.isEmpty()) {
            spot s = q.poll();

            if(s.count > T) break; //시간초과시
            if(s.x == N-1 && s.y == M-1) return s.count;


            for (int i = 0; i < 4; i++) {
                nowX = s.x + dirX[i];
                nowY = s.y + dirY[i];

                if (check()) {
                    if (!s.isGram){
                        if (!visited[nowX][nowY][0] && dp[nowX][nowY] == 0) {
                            visited[nowX][nowY][0] = true;
                            q.add(new spot(nowX, nowY, s.count + 1, s.isGram));
                        }
                        else if(!visited[nowX][nowY][0] && dp[nowX][nowY] == 2){
                            visited[nowX][nowY][0] = true;
                            q.add(new spot(nowX, nowY, s.count + 1, true));
                        }

                    }else {
                        if(!visited[nowX][nowY][1]){
                            visited[nowX][nowY][1] = true;
                            q.add(new spot(nowX, nowY, s.count + 1, s.isGram));
                        }
                    }

                }
            }
        }
        return -1;

    }


    public static boolean check() {
        return nowX >= 0 && nowX < N && nowY >= 0 && nowY < M;
    }

    public static class spot {
        int x;
        int y;
        int count;
        boolean isGram;

        public spot(int x, int y,int count,boolean isGram) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.isGram =isGram;
        }
    }

}