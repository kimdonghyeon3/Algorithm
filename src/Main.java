import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());
        String[] a = in.nextLine().split(" ");
        String[] b = in.nextLine().split(" ");

        String ans = "";

        for(int i = 0 ; i < N ; i++){
            if(a[i].equals(b[i])){
                ans += "D\n";
            }else if(a[i].equals("1") && b[i].equals("3")){
                ans += "A\n";
            }else if(a[i].equals("2") && b[i].equals("1")){
                ans += "A\n";
            }else if(a[i].equals("3") && b[i].equals("2")){
                ans += "A\n";
            }else ans+="B\n";

        }

        System.out.println(ans);

        return ;
    }
}