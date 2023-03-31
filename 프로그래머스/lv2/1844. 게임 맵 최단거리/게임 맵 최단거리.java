import java.util.*;
class Solution {
    boolean[][] visited;
    int[] dirX = {1,-1,0,0};
    int[] dirY = {0,0,-1,1};
    int nowX, nowY;
    int n,m;
    public int solution(int[][] maps) {
         n = maps[0].length -1;
         m = maps.length -1;
        visited = new boolean[m+1][n+1];
        // if(maps[m-1][n] == 0 && maps[m][n-1] == 0){
        //     return -1;
        // }
        bfs(0,0,maps);
        if(maps[m][n] == 1 || maps[m][n] == 0)
            return -1;
        
        return maps[m][n];
    }
    public void bfs(int x, int y, int[][] maps){
        
        visited[x][y] = true;
        Queue<spot> q = new LinkedList<>();
        q.add(new spot(x,y));
        
        while(!q.isEmpty()){
         spot s = q.poll();
        for(int i = 0; i < 4; i++){  
            nowX = s.x + dirX[i];
            nowY = s.y + dirY[i];
            
            if(check() && maps[nowX][nowY] == 1 && !visited[nowX][nowY]){
                visited[nowX][nowY] = true;
                maps[nowX][nowY] = maps[s.x][s.y] +1;
                q.add(new spot(nowX,nowY));
         }
            
        }
      }
    }
    public boolean check(){
        return nowX >= 0 && nowX <= m && nowY >= 0 && nowY <= n;
    }
    
    class spot{
        int x;
        int y;
        public spot(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}