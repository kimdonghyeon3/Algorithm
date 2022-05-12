import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static Integer[] dp;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N+1];

        dp[0] = 0;
        dp[1] = 1;

        pow(N);

        System.out.println(dp[N]);
    }
    public static int pow(int n){

        if(dp[n] == null){
            dp[n] = n;
            for(int i = 1 ; i*i <= n ; i++){
                dp[n] = Math.min(dp[n],pow(n - i*i)+1 );
            }
        }

        return dp[n];
    }
}
