import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < s.length(); i++ ) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                if (c + 13 > 'Z') {
                    sb.append((char)((c + 13) % 90 + 'A' -1));
                } else sb.append((char) (c + 13));
            }
              else  if (c >= 'a' && c <= 'z') {
                    if (c + 13 > 'z') {
                        sb.append((char)((c + 13) % 122 + 'a'-1));
                    } else sb.append((char) (c + 13));
                }
              else sb.append(c);
                }
        System.out.println(sb);
        }

    }
