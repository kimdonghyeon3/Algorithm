import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static Long[] dp = new Long[101];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        dp[0] = Long.valueOf(0);
        dp[1] = dp[2] = dp[3] = Long.valueOf(1);
        dp[4] = Long.valueOf(2);

        while(T-->0){
            int N = Integer.parseInt(br.readLine());

            if(N >= 5)
                wave(N);

            sb.append(dp[N] + "\n");
        }

        System.out.println(sb);

    }

    public static long wave(int n){

        if(dp[n] == null)
            dp[n] = wave(n-1) + wave(n-5);

        return dp[n];
    }



}
