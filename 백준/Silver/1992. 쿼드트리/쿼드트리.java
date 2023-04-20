import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// tip: each public class is put in its own file
public class Main
{
    static int[][] quad;
    static StringBuilder sb;
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        quad = new int[N][N];
        sb= new StringBuilder();

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < N; j++){
                quad[i][j] = s.charAt(j) -'0';
            }
        }

        partition(0,0,N);

        System.out.println(sb);

    }

    public static void partition(int row, int col, int size){
        if(check(row, col, size)){
            if(quad[row][col] == 1)
                sb.append(1);
            else
                sb.append(0);
            return;
        }

        int newSize = size / 2;
        sb.append("(");

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);

        sb.append(")");

    }

    public static boolean check(int row, int col , int size){
        int color = quad[row][col];

        for(int i = row; i < row + size; i++){
            for(int j = col ; j < col + size; j++){
                if(quad[i][j] != color)
                    return false;
            }
        }
        return true;
    }
}