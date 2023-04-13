// tip: each public class is put in its own file
import java.io.*;
import java.util.*;
public class Main
{
    static boolean[] visited;
    static int[] dp;
    static int N,M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        arr = new int[M + 1];
        dfs(0);
        System.out.println(sb);
    }
        static void dfs( int depth){
        if(depth == M){
            for(int i =1 ; i < M+1; i++){
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = 1; i < N+1; i++ ){
            if(!visited[i]){
                visited[i] = true;
                arr[depth+1] = i;
                dfs(depth+1);
                visited[i] = false;
            }
        }

    }

    }
