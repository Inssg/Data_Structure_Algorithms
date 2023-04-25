import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// tip: each public class is put in its own file
public class Main
{
    static int n,l,r;
    static int[][] land;
    static boolean[][] visited;
    static int[] dirX = {0,0,1,-1};
    static int[] dirY = {1,-1,0,0};
    static int nowX,nowY;
    static int sum;
    static int day =0;

    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        land = new int[n][n];


        for(int i = 0; i < n ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j =0; j < n; j++){
                land[i][j] =  Integer.parseInt(stk.nextToken());
            }
        }


        while(true){
            int w = 0;
            visited = new boolean[n][n];
            for(int i =0 ; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(!visited[i][j]){
                        w += bfs(i,j);
                    }
                }
            }

        if(w > 0)
            day++;
        else if(w == 0)
            break;
    }

        System.out.println(day);
}

    public static int bfs(int x, int y){
        Queue<spot> q = new LinkedList<>();
        ArrayList<spot> list = new ArrayList<>();
        q.add(new spot(x,y));
        int count = 1;
        sum = 0;
        visited[x][y] = true;

        while(!q.isEmpty()){
            spot s = q.poll();
            sum += land[s.x][s.y];
            list.add(s);
            for(int i = 0; i < 4; i++){
                nowX = s.x + dirX[i];
                nowY = s.y + dirY[i];
                if(check() && !visited[nowX][nowY] && Math.abs(land[s.x][s.y] - land[nowX][nowY]) >= l && Math.abs(land[s.x][s.y] - land[nowX][nowY]) <= r ){
                    q.add(new spot(nowX,nowY));
                    visited[nowX][nowY] = true;
                    count++;
                }
            }
        }

        if(list.size() > 1){
//            System.out.println("count = " + count);
//            System.out.println("list = " + list.size());
//            System.out.println("sum = " + sum);
            int avg = (int)Math.floor(sum / count);
            for(spot s : list){
                land[s.x][s.y] = avg;
            }
//            System.out.println(Arrays.deepToString(land));
        }

        if(list.size() == 1) count = 0;
        return count;
    }

static class spot{
    int x;
    int y;

    public spot(int x, int y){
        this.x = x;
        this.y = y;
    }
}

    static boolean check(){
        return nowX >= 0 && nowX < n && nowY >= 0 && nowY < n;
    }
}