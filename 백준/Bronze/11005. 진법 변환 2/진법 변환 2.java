import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[36];
        StringBuilder sb = new StringBuilder();
 
        int num = sc.nextInt();
        int slice = sc.nextInt();
        int i = 0;
 
        while (num > 0) {
 
            int strNum = num % slice;
            if (strNum < 10) {
                arr[i] = ((char) (strNum + '0'));// 숫자
            } else {
                arr[i] = ((char) (strNum - 10 + 'A'));
            }
 
            num /= slice;
            i++;
 
        }
 
        for (int j = i; j >= 0; j--) {
            sb.append(arr[j]);
        }
 
        System.out.println(sb.toString().trim());
 
    }
 
}
