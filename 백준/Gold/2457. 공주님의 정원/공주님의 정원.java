import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main
{
    static class Date implements Comparable<Date> {
        int month, day;
        public Date(int month, int day){
            this.month = month;
            this.day = day;
        }
        // 오름차순
        @Override
        public int compareTo(Date o){
            if(this.month == o.month){
                return this.day - o.day;
            }
            return this.month - o.month;
        }
        public void update(int month, int day){
            this.month = month;
            this.day = day;
        }
    }

    static class Flower implements Comparable<Flower> {
        Date start, end;

        public Flower(int startM, int startD, int endM, int endD){
            start = new Date(startM, startD);
            end = new Date(endM, endD);
        }

        // 내림차순
        @Override
        public int compareTo(Flower o){
            return o.end.compareTo(this.end);
        }
    }

    static int N, count = 0;
    static List<Flower> flowerList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){

            st= new StringTokenizer(br.readLine());

            int m1,d1,m2,d2;
            m1 = Integer.parseInt(st.nextToken());
            d1 = Integer.parseInt(st.nextToken());
            m2 = Integer.parseInt(st.nextToken());
            d2 = Integer.parseInt(st.nextToken());

            flowerList.add(new Flower(m1,d1,m2,d2));
        }

        Date end, cur;
        end = new Date(11, 30);
        cur = new Date(3, 1);

        // 끝나는 날짜순으로 내림차순 정렬
        Collections.sort(flowerList);

        while(!flowerList.isEmpty()){
            //현재 날짜 기준으로 최적의 결정 pick
            // List에서 기한내에 거르기
            int i;
            for(i = 0; i < flowerList.size(); i++){
                Flower f = flowerList.get(i);

                // 현재 날짜 >= 꽃의 피는날
                if(cur.compareTo(f.start) >= 0 && cur.compareTo(f.end) <= 0){
                    break;
                }
            }

            if(i >= flowerList.size()){
                count = 0;
                break;
            }
            //꽃 선택
            Flower obj = flowerList.remove(i);
            count++;
            //현재 날짜 해당 꽃의 지는 날짜로 업데이트
            cur.update(obj.end.month, obj.end.day);


            if(cur.compareTo(end) > 0) //현재 날짜 > 11/30
                break;
        }

        //원하는 꽃이 없을때
        if(cur.compareTo(end) <= 0) //현재 날짜 < 마지막날짜
            count = 0;
        System.out.println(count);
    }

}