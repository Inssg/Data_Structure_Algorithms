import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main
{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int M = Integer.parseInt(br.readLine());
        ArrayList<line> list = new ArrayList<>();

        while(true){
            st = new StringTokenizer(br.readLine(), " ");
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if(l == 0 && r == 0) break;
            if( r <= 0) continue;

            list.add(new line(l, r));
        }
        // 선분  start 오름차순 , 같다면 end 내림차순 정렬
        Collections.sort(list);

        int l = 0;
        int max = 0;
        int index = 0;
        int count = 0;

        while( l < M){
            boolean find = false;

            for(int i = index; i < list.size(); i++){
                line k = list.get(i);
                if(k.start > l)
                    break;

                if(max < k.end){
                    max = k.end;
                    index = i+1;
                    find = true;
                }
            }
            if(find){
                l = max;
                count++;
            }else {
                break;
            }
        }
        if(max < M) System.out.println(0);
        else
        System.out.println(count);
    }

    public static class line implements Comparable<line>{
        int start;
        int end;

        public line(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(line o){
            if(this.start == o.start)
                return o.end - this.end;
            else
                return this.start - o.start;
        }
    }
}