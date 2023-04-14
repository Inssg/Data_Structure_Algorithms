// tip: each public class is put in its own file
import java.io.*;
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if( N % 400 == 0){
            System.out.println(1);
        }else if( N % 4 == 0 && N % 100 != 0)
            System.out.println(1);
        else 
            System.out.println(0);
    }
}