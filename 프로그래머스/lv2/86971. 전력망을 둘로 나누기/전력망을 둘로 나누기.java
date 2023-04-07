import java.util.*;
 class Solution {
        int[][] dp;
        int count;
        public int solution(int n, int[][] wires) {
            int answer = 999;
            dp= new int[n][n];

            ArrayList<Integer> list = new ArrayList<>();

            //wires 에서 요소 하나를 빼고 dfs 돌렸을때  개수 차이
            for(int i = 0; i < wires.length; i++){
                dp[wires[i][0] -1][wires[i][1] -1] = 1;
                dp[wires[i][1] -1][wires[i][0] -1] = 1;
            }

            for(int i = 0; i < wires.length; i++){
                dp[wires[i][0] -1][wires[i][1] -1] = 0;
                dp[wires[i][1] -1][wires[i][0] -1] = 0;
                boolean[] visited = new boolean[n];
                count = 1;
                dfs(0,visited);
                // for(int j = 0; j < n ; j++){
                //     if(!visited[j]){
                //         int count = 1;
                //          dfs(j,count,visited);
                //     }
                // }

                dp[wires[i][0] -1][wires[i][1] -1] = 1;
                dp[wires[i][1] -1][wires[i][0] -1] = 1;
                list.add(Math.abs(count-(n - count)));
            }
            for(Integer a : list){
                answer = Math.min(answer,a);
            }

            return answer;
        }

        void dfs(int x, boolean[] visited){
            visited[x] = true;
            for(int i = 0; i < dp[0].length; i++){
                if(!visited[i] && dp[x][i] ==1){
                    count++;
//                    System.out.println(count);
                    dfs(i,visited);
                }
            }
        }
    }