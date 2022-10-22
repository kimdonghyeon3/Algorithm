import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        String str = in.nextLine();

        str = str.replaceAll("[^0-9]","");

        int temp = Integer.parseInt(str);

        System.out.println(temp);

        return ;
    }
}