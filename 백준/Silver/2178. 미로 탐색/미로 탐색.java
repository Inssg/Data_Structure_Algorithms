import java.io.*;
import java.util.*;


public class Main {
    static int[][] arr;
    static boolean[][] visited ;
    // 가로 세로 대각선 연결 dfs
    static int[] dirX = new int[]{0, 0, -1,1};
    static int[] dirY = new int[]{1, -1,0,0};
    //현재 위치 x, y
    static int nowX, nowY,count;
    static int result;

    // 지도 밖에 못나가게 Range_Check
    // 방문 visited
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

        arr = new int[h + 1][w + 1];
        visited = new boolean[h + 1][w + 1];

        for (int i = 1; i <= h; i++) {
            String s = br.readLine();
            for (int j = 1; j <= w; j++) {
                arr[i][j] = s.charAt(j-1) - '0';
            }
        }
        BFS(1, 1);
        System.out.println(arr[h][w]);
    }

    static void BFS(int x, int y) {
        Queue<spot> que = new LinkedList<>();
        visited[x][y] = true;
        //상하좌우 que 다넣어주기
        que.add(new spot(x,y));

        while (!que.isEmpty()) {
            spot q = que.poll();

            for (int i = 0; i < 4; i++) {
                nowX = q.x + dirX[i];
                nowY = q.y + dirY[i];
                if (Range_Check(nowX, nowY) && !visited[nowX][nowY] && arr[nowX][nowY] == 1) {
                    que.add(new spot(nowX,nowY));
                    arr[nowX][nowY] = arr[q.x][q.y] +1;
                    visited[nowX][nowY]= true;
                }
            }
        }
    }

    static boolean Range_Check(int x, int y) {
       if (x >=0 && x < arr.length && y >= 0 && y<arr[0].length)
           return true;

       return false;
    }
    static class spot{
        int x;
        int y;

        spot(int x, int y) {
            this.x =x;
            this.y =y;
        }
    }
}













