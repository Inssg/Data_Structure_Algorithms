import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        // 입력
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String[] input01 = br.readLine().split(" ");
        final String[] input02 = br.readLine().split(" ");

        final int candidateLen = Integer.parseInt(input01[0]);
        final int winnerLen = Integer.parseInt(input01[1]);

        final int cutLine = Arrays.stream(input02)
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(winnerLen)
                .skip(winnerLen - 1)
                .findFirst()
                .get();

 
        System.out.print(cutLine);
    }

}
