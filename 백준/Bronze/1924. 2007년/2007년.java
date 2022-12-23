import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int k = 1;
        int p = 0;

        while (k < a) {
            switch (k) {
                case 1: case 3: case 5: case 7: case 8:
                case 10: case 12:
                    p += 31;
                    break;
                case 4: case 6: case 9: case 11:
                    p += 30;
                    break;
                default :
                    p += 28;
                    break;
            }
            k++;
        }
        int x = (p + b) % 7;
        String s = "";
        switch (x) {
            case 1:
                s = "MON";
                break;
            case 2:
                s = "TUE";
                break;
            case 3:
                s = "WED";
                break;
            case 4:
                s = "THU";
                break;
            case 5:
                s = "FRI";
                break;
            case 6:
                s = "SAT";
                break;
            case 0:
                s = "SUN";
                break;
        }
        System.out.println(s);
    }

}
