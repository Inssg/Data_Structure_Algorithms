import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// tip: each public class is put in its own file
public class Main
{
    static boolean[] visited;
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        visited = new boolean[100000000];
        int answer =bfs(n,k,0);
        System.out.println(answer);
    }
    //재귀형식으로 n *2 , n -1 , n+1 3개를 비교하여 더작은 case로 다가가야한다.
    //dfs로 했더니 스택오버플로우 발생 bfs로 가자.
    public static int bfs(int x, int y, int depth) {
        Queue<spot> q = new LinkedList<>();
        q.add(new spot(x,depth));
        visited[x] = true;
        while (!q.isEmpty()) {
            spot s = q.poll();
            visited[s.x] =true;
            if(s.x == y){
              return s.depth;
            }
            if(s.x < y) {
                if (!visited[s.x * 2])
                    q.add(new spot(s.x * 2, s.depth + 1));
            }
            if(s.x > 0) {
                if (!visited[s.x - 1])
                    q.add(new spot(s.x - 1, s.depth + 1));
            }
            if(!visited[s.x+1])
            q.add(new spot(s.x +1,s.depth+1));
        }
        return 0;
    }
   static public class spot{
        int x;
        int depth;

        public spot(int x, int depth) {
            this.x = x;
            this.depth = depth;
        }
    }
}