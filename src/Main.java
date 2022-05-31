import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long result = max(a,b);


        for(int i = 1 ; i <= result ; i++)
            sb.append("1");

        System.out.println(sb);

    }

    public static long max(long A, long B){

        long max = Math.max(A,B);
        long min = Math.min(A,B);
        long result = 1;
        while(min != 0){
            result = max % min;
            max = min;
            min = result;
        }
        return max;
    }

    public static long min(int a, int b){

        return (a*b)/max(a, b);
    }
}





