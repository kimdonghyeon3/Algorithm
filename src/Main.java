import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        String a = in.nextLine();
        String str = in.nextLine();
        String ans = "";

        int num = 0;

        for(int i = 0 ; i < str.length() ; i++){


            if(str.charAt(i) == '#'){
                num += Math.pow(2, 6 - i%7)*1;
            }

            if(i%7 == 6 && i != 0){
                ans += (char)num;
                num = 0;
            }

        }

        System.out.println(ans);

        return ;
    }
}