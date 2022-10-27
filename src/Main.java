import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        int ans = 0;

        for(int i=2; i<=N; i++){
            // prime[i]가 소수라면
            if(isPrime(i)){
                ans++;
            }
        }

        System.out.println(ans);
    }

    private static boolean isPrime(int num) {

        for (int i = 2; i<=(int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}