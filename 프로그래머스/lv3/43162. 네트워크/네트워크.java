class Solution {
    boolean[] visited;
    int answer=0;
    public int solution(int n, int[][] computers) {
       
        visited = new boolean[n];
        // 인접한 그룹 개수 dfs
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                answer++;
                dfs(i,computers);
            }
        }
        return answer;
    }
    public void dfs(int x, int[][]computers){
        visited[x]= true;
        for(int i = 0; i < computers.length; i++){
            if(!visited[i] && computers[x][i] ==1)
                dfs(i,computers);
        }
    }
}