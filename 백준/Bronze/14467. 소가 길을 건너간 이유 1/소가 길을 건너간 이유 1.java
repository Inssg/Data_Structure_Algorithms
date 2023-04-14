// tip: each public class is put in its own file
import java.io.*;
import java.util.*;
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Integer[] cow = new Integer[11];
        int count = 0;

        while(N-- > 0){
            StringTokenizer stk =  new StringTokenizer(br.readLine(), " ");
            int c = Integer.parseInt(stk.nextToken());
            int w = Integer.parseInt(stk.nextToken());

            if(cow[c] != null && cow[c] != w)
                count++;
            cow[c] = w;
        }

        System.out.println(count);
    }


}
