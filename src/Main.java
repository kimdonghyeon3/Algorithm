import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static Integer[] dp;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N+1];
        dp = new Integer[N+1];

        for(int i = 1 ; i <= N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 0;
        dp[1] = arr[1];

        if(N > 1) {
            dp[2] = arr[2] + arr[1];
            for(int i = 0 ; i <= N ; i++)
                stair(i);
        }

        System.out.println(dp[N]);

    }

    public static int stair(int n){

        if(dp[n] == null){
            dp[n] = Math.max(stair(n-3)+arr[n-1], stair(n-2)) + arr[n];
        }

        return dp[n];
    }
}
