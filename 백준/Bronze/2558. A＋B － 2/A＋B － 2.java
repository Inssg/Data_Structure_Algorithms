import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int i = Integer.parseInt(a);
        int o = Integer.parseInt(b);
        System.out.println(i + o);
    }
}