import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        String str = in.next();
        String ans = "";

        for(int i = 0 ; i < str.length() ; i++){

            if( i == str.indexOf(str.charAt(i))){
                ans += str.charAt(i);
            }

        }




        System.out.println(ans);

        return ;
    }
}