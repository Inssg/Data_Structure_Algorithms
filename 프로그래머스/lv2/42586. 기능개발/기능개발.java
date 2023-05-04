import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<progress> q = new LinkedList<>();

            for(int i = 0; i < progresses.length; i++){
                q.add(new progress(progresses[i],speeds[i]));
            }

            int day = 1;

            ArrayList<Integer> arr = new ArrayList<>();

            while(!q.isEmpty()){
                progress ps =  q.poll();
                int w = 0;
                while(ps.p + ps.s * day < 100)
                    day++;
                w++;
                while(!q.isEmpty()){
                    progress pss =  q.peek();
                    if(pss.p + pss.s * day >= 100){
                        q.poll();
                        w++;
                    }else{

                        break;
                    }
                }
                arr.add(w);
            }

            int[] answer = new int[arr.size()];

            for(int i = 0; i < arr.size(); i++){
                answer[i] = arr.get(i);
            }

            return answer;
        }

        class progress{
            int p;
            int s;

            progress(int p, int s){
                this.p = p;
                this.s = s;
            }
        }
}