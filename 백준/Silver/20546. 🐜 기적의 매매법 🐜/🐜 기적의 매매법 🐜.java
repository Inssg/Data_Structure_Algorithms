// tip: each public class is put in its own file
import java.io.*;
import java.util.*;
public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = Integer.parseInt(br.readLine());

        int J = money;
        int S = money;
        StringTokenizer stk =  new StringTokenizer(br.readLine(), " ");

        int[] price = new int[14];

        for(int i = 0; i < 14; i++){
            price[i] = Integer.parseInt(stk.nextToken());
        }

        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < 14; i++){
            if(J >= price[i]){
                count1 += J / price[i];
                J %= price[i];
            }

            if(i >=3){
                if(price[i-3] < price[i-2] && price[i-2] < price[i-1] ){
                    S += price[i] * count2;
                    count2 = 0;
                }

                if(price[i-3] > price[i-2] && price[i-2] > price[i-1] ){
                    count2 += S / price[i];
                    S %= price[i];
                }

            }
        }

        int a = count1 * price[13] + J;
        int b = count2 * price[13] + S;


        if(a > b)
            System.out.println("BNP");
        else if(a < b)
            System.out.println("TIMING");
        else
            System.out.println("SAMESAME");
    }


}
