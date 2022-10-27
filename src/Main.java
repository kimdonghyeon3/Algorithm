
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < N ; i++){
            StringBuilder sb = new StringBuilder();
            int num = Integer.parseInt(sb.append(in.next()).reverse().toString());

            if(isPrime(num)){
                ans.append(num + " ");
            }

        }

        System.out.println(ans);
    }

    private static boolean isPrime(int num) {

        if(num <= 1)
            return false;

        for (int i = 2; i<=(int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}