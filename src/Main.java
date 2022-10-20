import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        String str1 = in.next();

        String ans = "";
        for(int i = 0 ; i < str1.length() ; i++){
            if(Character.isLowerCase(str1.charAt(i))){
                ans += Character.toUpperCase(str1.charAt(i));
            }else{
                ans += Character.toLowerCase(str1.charAt(i));
            }
        }


        System.out.println(ans);

        return ;
    }
}