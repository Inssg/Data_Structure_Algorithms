// tip: each public class is put in its own file

import java.util.*;
import java.io.*;

public class Main {

    static boolean visited[];
    static int[] arr;
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visited = new boolean[n];

        dfs(n, m, 0,0);


    }
    public static void dfs(int n, int m,int depth,int start){
        if(depth == m){
            for(int a : arr){
               System.out.print(a + " ");
            }
            System.out.println();
            return;
        }

        for(int i = start; i < n; i++ ){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i+1;
                dfs(n, m, depth + 1,i);
                visited[i] = false;
            }
        }
    }
}