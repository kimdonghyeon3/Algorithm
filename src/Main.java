import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static Integer[] dp;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[N];
        dp = new Integer[N];

        for(int i = 0 ; i < N ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];

        sum(N-1);

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < N ; i++){
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }

    public static int sum(int n){

        if(dp[n] == null){
            dp[n] = Math.max(arr[n], sum(n-1) + arr[n]);
        }

        return dp[n];
    }

}
