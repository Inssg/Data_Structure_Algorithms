import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int t = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[t];
        for (int i=0,j =1; i< t; i++, j ++) {
            arr[i] = j;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0,p=1; list.size() != t; i++ ) {
            if (arr[i % t] != 0) {
                if (p == k) {
                    list.add(arr[i % t]);
                    arr[i % t] = 0;
                    p =1;
                    continue;
                }
                p++;
            }
        }
        sb.append("<");
        for (Integer i : list) {
            sb.append(i).append(", ");
        }
        String s = sb.substring(0, sb.length() - 2);


        System.out.println(s+">");

    }
    }





