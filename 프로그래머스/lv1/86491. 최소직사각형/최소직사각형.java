class Solution {
    public int solution(int[][] sizes) {
         int answer = 0;
       
        //가로와 세로길이 중에서 가장 큰값을 찾고, 가장 작은 값을 찾고 가장 작은 값보다
        // 가로나 세로길이 모두 가장 작은 값보다 크면 가장 작은 값의 길이를 둘중 작은걸로 변경
       int max = sizes[0][0];
       int min = sizes[0][0];
        
        for(int i = 0; i < sizes.length; i++){
            for(int j = 0; j < 2; j++){
                if(max < sizes[i][j]){
                    max = sizes[i][j];
                }
                if(min > sizes[i][j]){
                    min = sizes[i][j];
                }
            }
        }
        
        for( int i = 0; i < sizes.length; i++){
           if(min < Math.min(sizes[i][0], sizes[i][1]))
               min = Math.min(sizes[i][0], sizes[i][1]);
        }
       
        
        answer = max * min;
        
        
        return answer;
    }
}