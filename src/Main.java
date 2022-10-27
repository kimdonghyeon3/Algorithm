
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        int[][] arr = new int[N+2][N+2];

        int[] movex = {1,0,0,-1};
        int[] movey = {0,1,-1,0};

        int ans = 0;

        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= N ; j++) {
                arr[i][j] = Integer.parseInt(in.next());
            }
        }

        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= N ; j++) {

                boolean check = true;

                for(int k = 0 ; k < 4 ; k++){
                    int x = i + movex[k];
                    int y = j + movey[k];
                    if(arr[i][j] <= arr[x][y]){
                        check = false;
                        break;
                    }
                }

                if(check){
                    ans++;
                }

            }
        }


        System.out.println(ans);
    }
}