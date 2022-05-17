import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static Long[][] dp;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new Long[K+1][N+1];

        for(int i = 0 ; i <= N ; i++){
            dp[0][i] = Long.valueOf(0);
        }

        sum(K,N);

        System.out.println(dp[K][N]%1000000000);

    }

    public static long sum(int a, int b){

        if(b == 0 || a==1)
            return dp[a][b] = Long.valueOf(1);

        if(dp[a][b] == null){
            dp[a][b] = sum(a-1,b) + sum(a,b-1);
        }

        return dp[a][b]%1000000000;
    }
}
