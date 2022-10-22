import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        String str = in.next();

        str = str.toLowerCase();

        for(int i = 0 ; i < str.length()/2 ; i ++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

        return ;
    }
}