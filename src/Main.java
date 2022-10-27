
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        int[][] arr = new int[N][N];

        int max = 0;

        for(int i = 0 ; i < N ; i++){
            int sum = 0;
            for(int j = 0 ; j < N ; j++) {
                arr[i][j] = Integer.parseInt(in.next());
                sum += arr[i][j];
            }
            max = Math.max(max, sum);
        }

        for(int i = 0 ; i < N ; i++){
            int sum = 0;
            for(int j = 0 ; j < N ; j++) {
                sum += arr[j][i];
            }
            max = Math.max(max, sum);
        }

        int sum = 0;

        for(int i = 0 ; i < N ; i++){
            sum += arr[i][i];
        }
        max = Math.max(max, sum);

        System.out.println(max);
    }
}