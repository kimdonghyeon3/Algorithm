import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        String str = in.next();

        String ans = String.valueOf(str.charAt(0));

        int cnt = 1;

        for(int i = 1 ; i < str.length() ; i++){

            if( str.charAt(i) == str.charAt(i-1)){
                cnt++;
            }else{
                ans += cnt;

                ans += str.charAt(i);
                cnt = 1;
            }
        }

        if(cnt != 1) ans += cnt;

        System.out.println(ans.replaceAll("1",""));



        return ;
    }
}