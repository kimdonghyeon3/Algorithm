import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(min(A,B) + "\n");
        }


        System.out.println(sb);
    }

    public static int max(int A, int B){

        int max = Math.max(A,B);
        int min = Math.min(A,B);
        int result = 1;
        while(min != 0){
            result = max % min;
            max = min;
            min = result;
        }
        return max;
    }

    public static int min(int a, int b){

        return (a*b)/max(a, b);
    }
}





