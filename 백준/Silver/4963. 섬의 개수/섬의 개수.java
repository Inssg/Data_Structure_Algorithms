import java.io.*;
import java.util.*;


public class Main {
    static int[][] arr;
    static boolean[][] visited ;
    // 가로 세로 대각선 연결 dfs
    static int[] dirX = new int[]{0, 0, -1,1,1,1,-1,-1};
    static int[] dirY = new int[]{1, -1,0,0,1,-1,1,-1};
    //현재 위치 x, y
    static int nowX, nowY,count;
    static String s = "";


    // 지도 밖에 못나가게 Range_Check
    // 방문 visited
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while ((s= br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s, " ");
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            if(w == 0 && h==0)
                break;
            arr = new int[h][w];
            visited = new boolean[h][w];
            count = 0;
            //입력
            for (int i = 0; i < h; i++) {
                StringTokenizer tk = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(tk.nextToken());

                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && arr[i][j] == 1) {

                        DFS(i, j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);

    }

    static void DFS(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 8; i++) {
            nowX = x + dirX[i];
            nowY = y + dirY[i];

            if (Range_Check(nowX, nowY) && !visited[nowX][nowY] && arr[nowX][nowY] == 1) {
                DFS(nowX, nowY);
            }
        }

    }

    static boolean Range_Check(int x, int y) {
       if (x >=0 && x < arr.length && y >= 0 && y<arr[0].length)
           return true;

       return false;
    }
}













