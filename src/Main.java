import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        String[] strArr = in.nextLine().split(" ");
        String ans = "";

        ans += strArr[0] + " ";

        for(int i = 1 ; i < strArr.length ; i++){
            if(Integer.parseInt(strArr[i-1]) < Integer.parseInt(strArr[i])){
                ans += strArr[i] + " ";
            }
        }



        System.out.println(ans);

        return ;
    }
}