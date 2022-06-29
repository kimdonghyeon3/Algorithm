import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int arr[] = new int[n];

            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long sum = 0;

            for(int i = 0 ; i < arr.length ; i++){
                for(int j = i+1 ; j < arr.length ; j++){
                    sum += gcd(arr[i],arr[j]);
                }
            }
            sb.append(sum + "\n");
        }

        System.out.println(sb);
    }

    public static int gcd(int a, int b){
        int max = a >= b ? a : b;
        int min = a >= b ? b : a;
        int temp;

        while(min != 0){
            temp = max % min;
            max = min;
            min = temp;
        }

        return max;
    }
}





