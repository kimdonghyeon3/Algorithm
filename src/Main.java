
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        String[] arr = new String[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = in.next();
        }

        int w = 1;
        int ans = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals("1")){
                ans += w;
                w ++;
            }else{
                w = 1;
            }
        }

        System.out.println(ans);
    }
}