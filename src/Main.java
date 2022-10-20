import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        String str1 = in.next();

        String[] arr = str1.split(" ");

        int max = 0;
        String ans = "";

        for(String str = arr){
            if(max < str.length()){
                ans = str;
                max = str.length();
            }
        }


        System.out.println(ans);

        return ;
    }
}