
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int N = Integer.parseInt(in.next());
        int M = Integer.parseInt(in.next());

        int[][] arr = new int[M][N];

        int ans = 0;

        for(int i = 0 ; i < M ; i++){
            for(int j = 0 ; j < N ; j++) {
                arr[i][j] = Integer.parseInt(in.next());
            }
        }

        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= N ; j++) {

                int cnt = 0;
                int pi = 0, pj = 0;
                for(int s = 0 ; s < M ; s++){
                    for(int k = 0 ; k < N ; k++) {
                        if(arr[s][k] == i){
                            pi = k;
                        }

                        if(arr[s][k] == j ){
                            pj = k;
                        }
                    }

                    if(pi < pj) cnt++;
                }

                if(cnt == M){
                    ans++;
                }

            }
        }

        System.out.println(ans);
    }
}