import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
            int[] answer = new int[3];
            int length = answers.length;
            int[] a = new int[length];
            int[] b = new int[length];
            int[] c = new int[length];

        
            for(int i = 0; i < length; i++){
                a[i] = i % 5 +1;
            }

            b[0] = 2;
            b[1] = 1;
            for(int i = 2; i < length; i++){
                if( i % 2 == 0){
                    b[i] = 2;
                }else if(b[i -2] == 1 ){
                    b[i] = 3;
                }else if(b[i -2] == 5){
                    b[i] = 1;
                }
                else{
                    b[i] = b[i-2] +1;
                }
            }

            for(int i = 0; i < length; i++){
                if(i % 2  == 1){
                    c[i] = c[i-1];
                }
                if(i % 10 == 0) c[i] = 3;
                if(i % 10 == 2) c[i] = 1;
                if(i % 10 == 4) c[i] = 2;
                if(i % 10 == 6) c[i] = 4;
                if(i % 10 == 8) c[i] = 5;
            }

            for(int i = 0; i < length; i++){
                if(answers[i] == a[i])
                    answer[0]++;
                if(answers[i] == b[i])
                    answer[1]++;
                if(answers[i] == c[i])
                    answer[2]++;
            }
            int max = answer[0];
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            for(int i = 1; i < 3; i++){
                if(answer[i] > max ){
                    max = answer[i];
                    arr.clear();
                    arr.add(i+1);
                }else if(answer[i] == max){
                    arr.add(i+1);
                }
            }
            int[] result = new int[arr.size()];
            for(int i = 0; i < arr.size(); i++){
                result[i] = arr.get(i);
            }
            return result ;
    }
}