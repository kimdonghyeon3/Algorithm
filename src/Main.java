import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static Long[] dp;
    static char[] code;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        code = br.readLine().toCharArray();

        if(code[0] == '0')
            System.out.println("0");
        else{
//            System.out.println(code.length);
            dp = new Long[code.length +1];
            dp[0] = dp[1] = Long.valueOf(1);
            encoding(code.length);

//            for(long a : dp){
//                System.out.print(a + " ");
//            }
//
//            System.out.println();

            System.out.println(dp[code.length]%1000000);
        }

    }

    public static long encoding(int n){

        if(dp[n] == null){

            if(code[n-1] == '0'){
                if(code[n-2] == '1' || code[n-2] == '2') {
                    dp[n] = encoding(n - 2);
                }
                else{
                    System.out.println("0");
                    System.exit(0);
                }

            }else if(code[n-2] == '0'){
                dp[n] = encoding(n-1);
            }else{
                int now = code[n-1] - '0';
                int pre = code[n-2] - '0';
                if( ((pre*10) + now) > 26)
                    dp[n] = encoding(n-1);
                else
                    dp[n] = encoding(n-1) + encoding(n-2);
            }


        }

        return dp[n]%1000000;
    }

}
