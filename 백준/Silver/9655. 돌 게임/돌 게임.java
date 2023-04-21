// tip: each public class is put in its own file
import java.io.*;
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if( N % 2 == 0)
        System.out.println("CY");
        else
        System.out.println("SK");
    }
}