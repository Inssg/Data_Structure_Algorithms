import java.util.*;
class Solution {
    boolean[] visited;
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        
        //그리디?
        //dfs ? visiteds는 1차원배열로 dungeon
        visited = new boolean[dungeons.length];
        
        Arrays.sort(dungeons, (o1,o2) -> {
            return o1[0] != o2[0] ? o2[0]-o1[0] : o1[1] - o2[1]; 
        });
        
        dfs(0,k,dungeons);
        return answer;
    }
    void dfs(int stage, int k, int[][] dungeons) {
       answer = Math.max(answer,stage);
        
        for(int i = 0; i < dungeons.length; i++){
            if(!visited[i] && k >= dungeons[i][0] ){
                visited[i] = true;
                dfs(stage+1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
    }
}