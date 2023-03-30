import java.util.*;
class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        
        int nextIndex; 
        int move = length - 1;
        
        for(int i = 0; i < name.length(); i++){
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            
            nextIndex = i +1;
            
            //연속되는 A 개수 확인
            while(nextIndex < length && name.charAt(nextIndex) == 'A')
                nextIndex++;
    
            move = Math.min(move, i * 2 + length - nextIndex);
            move = Math.min(move, (length - nextIndex) * 2 + i);
        }
        return answer + move;
}
}