import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = in.nextInt();

        while(N-->0){
            String str = in.next();
            String ans = "";
            for(int i = str.length()-1 ; i >= 0 ; i--){
                sb.append(str.charAt(i));
            }
            sb.append("\n");
        }

        System.out.println(sb);

        return ;
    }
}