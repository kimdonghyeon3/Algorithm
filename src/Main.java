import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        String[] strArr = in.nextLine().split(" ");

        int max = 0, ans = 0;

        for(int i = 0 ; i < strArr.length ; i++){
            if(max < Integer.parseInt(strArr[i])){
                max = Integer.parseInt(strArr[i]);
                ans++;
            }
        }




        System.out.println(ans);

        return ;
    }
}