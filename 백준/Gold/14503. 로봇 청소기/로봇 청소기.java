// tip: each public class is put in its own file

import java.util.*;
import java.io.*;

public class Main {

    static int[][] ro;
    static int n, m;
    static int nowX, nowY;
    static int[] dirX = {0, 0, 1, -1};
    static int[] dirY = {1, -1, 0, 0};
    static int ans;
    static boolean stop;

    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        ro = new int[n][m];

        st = new StringTokenizer(br.readLine(), " ");

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                ro[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(r, c, d);

        System.out.println(ans+1);

    }

    public static void bfs(int r, int c, int d) {

        Queue<spot> q = new LinkedList<>();
        q.add(new spot(r, c));

        while (!q.isEmpty()) {
            spot s = q.poll();

            if (ro[s.x][s.y] == 0)
                ro[s.x][s.y] = -1;


            int count = 0;
            for (int i = 0; i < 4; i++) {
                nowX = s.x + dirX[i];
                nowY = s.y + dirY[i];

                if (check() && ro[nowX][nowY] == 0) {
                    count++;
                }
            }

            if (count == 0) {
                switch (d) {
                    case 0:
                        nowX = s.x + 1;
                        nowY = s.y;
                        if (ro[nowX][nowY] == 1) stop = true;
                        else {
                            q.add(new spot(nowX, nowY));
                        }
                        break;
                    case 1:
                        nowX = s.x;
                        nowY = s.y - 1;
                        if (ro[nowX][nowY] == 1) stop = true;
                        else {
                            q.add(new spot(nowX, nowY));
                        }
                        break;
                    case 2:
                        nowX = s.x - 1;
                        nowY = s.y;
                        if (ro[nowX][nowY] == 1) stop = true;
                        else {
                            q.add(new spot(nowX, nowY));
                        }
                        break;
                    case 3:
                        nowX = s.x;
                        nowY = s.y + 1;
                        if (ro[nowX][nowY] == 1) stop = true;
                        else {
                            q.add(new spot(nowX, nowY));
                        }
                        break;
                }
            } else {
                if (d == 0) d = 3;
                else d -= 1;

                boolean b = false;
                while (!b) {
                    switch (d) {
                        case 0:
                            nowX = s.x - 1;
                            nowY = s.y;
                            if (check() && ro[nowX][nowY] == 0) {
                                q.add(new spot(nowX, nowY));
                                b=true;
                                ans++;
                            } else d = 3;
                            break;
                        case 1:
                            nowX = s.x;
                            nowY = s.y + 1;
                            if (check() && ro[nowX][nowY] == 0) {
                                q.add(new spot(nowX, nowY));
                                b=true;
                                ans++;
                            } else d -= 1;
                            break;
                        case 2:
                            nowX = s.x + 1;
                            nowY = s.y;
                            if (check() && ro[nowX][nowY] == 0) {
                                q.add(new spot(nowX, nowY));
                                b=true;
                                ans++;
                            } else d -= 1;
                            break;
                        case 3:
                            nowX = s.x;
                            nowY = s.y - 1;
                            if (check() && ro[nowX][nowY] == 0) {
                                q.add(new spot(nowX, nowY));
                                b=true;
                                ans++;
                            } else d -= 1;
                            break;
                    }
                }
            }

            if (stop) break;
        }
    }

    public static boolean check() {
        return nowX >= 0 && nowX < n && nowY >= 0 && nowY < m;

    }

    public static class spot {
        int x;
        int y;

        spot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}