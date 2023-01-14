import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] t = new int[26];
      for(int i = 0; i < 26 ; i++){
          t[i] = -1;
      }

        for (int i = 0; i < s.length(); i++) {
            int p = s.charAt(i) - 97;
            if (t[p] == -1) {
                t[p] = i;
            }
        }
        String s1 = Arrays.toString(t).replace(",","").replace("[","").replace("]","");

        System.out.println(s1);
    }


}