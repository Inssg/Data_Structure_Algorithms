import java.util.*;
class Solution {
        public int solution(int[] priorities, int location) {
            int answer = 0;
            Queue<process> q = new LinkedList<>();
            char c = 'A';

            for(int i = 0 ; i < priorities.length; i++, c++){
                q.add(new process(c,priorities[i]));
            }

            Integer[] pts = Arrays.stream(priorities).boxed().toArray(Integer[]::new);
            Arrays.sort(pts, Collections.reverseOrder());
            ArrayList<Character> list = new ArrayList<>();
            int k = 0;

            while(!q.isEmpty()){
                process pc = q.poll();
                if(pc.p == pts[k]){
                    list.add(pc.c);
                    k++;
                }else{
                    q.add(pc);
                }
            }
   
            char w = (char)('A' + location);
            answer = list.indexOf(w);

            return answer+1;
        }
        class process{
            char c;
            int  p;

            process(char c, int p){
                this.c = c;
                this.p = p;
            }
        }
    }