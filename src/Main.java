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

        for(int i = 0; i < N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];

        for(int i = 1 ; i < N ; i++){
            up(i);
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < N ; i++){
            max = Math.max(dp[i], max);
        }

        System.out.println(max);

    }
    public static int up(int n){

        if(dp[n] == null){
            dp[n] = 1;

            for(int i = 0 ; i < n ; i++){
                if(arr[n] > arr[i]){
                    dp[n] = Math.max(dp[n], up(i) + arr[n]);
                }else{
                    dp[n] = Math.max(dp[n],arr[n]);
                }
            }

        }


        return dp[n];
    }
}
