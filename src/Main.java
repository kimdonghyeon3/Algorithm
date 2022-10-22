import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        String str = in.nextLine();

        str = str.toLowerCase().replaceAll("[^a-z]","");
        String str1 = new StringBuilder(str).reverse().toString();

        if(str.equals(str1)) {
            System.out.println("YES");
            return;
        }

        System.out.println("NO");

        return ;
    }
}