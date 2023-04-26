import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// tip: each public class is put in its own file
public class Main
{
    static int n;
    static boolean[] visited;
    static int min = (int)1e8;
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int[][] tsp = new int[n][n];


        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < n; j++){
                tsp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //시작점을 달리하여, dfs 수행
        for(int i = 0; i < n; i++){
            visited = new boolean[n];
            dfs(i, 0,0, tsp,i);
        }

        System.out.println(min);
    }

    public static void dfs(int x, int depth,int cost, int[][] tsp,int start){
        if(depth == n-1){
            // 마지막 여행지에서 처음여행지로 돌아오는 비용을 더해서 리턴
            // 처음 여행지가 어딘지 저장하고 있어야함
            if(tsp[x][start] !=0)
            min = Math.min(min, cost + tsp[x][start]);
            return;
        }
        visited[x] = true;
        for(int i = 0; i < n ; i++){
            if(!visited[i] && tsp[x][i] != 0){
                visited[i] = true;
                dfs(i, depth + 1, cost + tsp[x][i], tsp,start);
                visited[i] = false;
            }
        }
    }







}
