import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static Integer[] dp;
    static Integer[] re_dp;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[N];
        dp = new Integer[N];
        re_dp = new Integer[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1;
        re_dp[re_dp.length-1] = 1;

        for(int i = 1 ; i < N ;i++){
            up(i);
            re_up(N-i);
        }
        re_up(0);

//        for(Integer a : dp){
//            System.out.print(a + " ");
//        }
//        System.out.println();
//        for(Integer a : re_dp){
//            System.out.print(a + " ");
//        }

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < N ; i++){
            max = Math.max(max, dp[i] + re_dp[i]);
        }

        System.out.println(max-1);

    }
    public static int re_up(int n){

        if(re_dp[n] == null){
            re_dp[n] = 1;

            for(int i = n+1 ; i < re_dp.length ; i++){
                if(arr[n] > arr[i]){
                    re_dp[n] = Math.max(re_dp[n], re_up(i) + 1);
                }
            }
        }

        return re_dp[n];
    }

    public static int up(int n){

        if(dp[n] == null){
            dp[n] = 1;

            for(int i = 0 ; i < n ; i++){
                if(arr[n] > arr[i]){
                    dp[n] = Math.max(dp[n], up(i) + 1);
                }
            }
        }

        return dp[n];
    }

}
