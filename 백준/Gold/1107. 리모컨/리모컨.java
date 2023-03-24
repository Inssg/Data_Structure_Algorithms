import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution sol = new Solution();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean[] error = new boolean[10];
        if(M>0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<M; i++){
                error[Integer.parseInt(st.nextToken())] = true;
            }
        }
        System.out.println(sol.solution(N,error));
        br.close();
    }
}
class Solution{
    boolean[] error;
    public int solution(int N, boolean[] errArr){
        if(N==100) return 0;
        this.error = errArr;
        int answer = Math.abs(N-100);
        for(int i=0; i<1000001; i++){
            String str = String.valueOf(i);
            if(isValid(str)) answer = Math.min(Math.abs(N-i)+str.length(),answer);
        }
        return answer;
    }
    public boolean isValid(String str){
        for(int j=0; j<str.length(); j++){
            if(error[str.charAt(j)-'0'])   return false;
        }
        return true;
    }
}