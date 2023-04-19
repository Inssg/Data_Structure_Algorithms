import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// tip: each public class is put in its own file
public class Main
{
    static int a =0;
    static int b =0;
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(br.readLine());

        int[][] p = new int[N][N];
        for(int i = 0 ; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < N; j++){
                p[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0,0,p, N);

        System.out.println(a);
        System.out.println(b);

    }

    public static void partition(int row, int col, int[][] p, int size){

        if(check(row, col, p, size)){
            if(p[row][col] == 0) a++;
            else b++;

            return;
        }

        int newSize = size /2;

        partition(row,col,p, newSize); //상좌
        partition(row,col + newSize, p, newSize); //상우
        partition(row + newSize, col, p, newSize); //하좌
        partition(row + newSize, col + newSize, p , newSize); //하우

    }

    public static boolean check(int row, int col, int[][] p, int size){
        int color = p[row][col];
        for(int i = row; i < row + size; i++){
            for(int j = col; j < col + size; j++){
                if(p[i][j] != color){
                    return false;
                }
            }
        }
        return true;
    }
}