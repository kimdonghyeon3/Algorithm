import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        String s = in.next();
        char t = in.next().toCharArray()[0];

        int[] arr = new int[s.length()];
        int dist = 1000;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == t){
                dist = 0;
                arr[i] = dist;

            }else{
                dist++;
                arr[i] = dist;
            }
        }

        dist = 1000;
        for(int i = s.length()-1 ; i >= 0  ; i--){
            if(s.charAt(i) == t){
                dist = 0;
                arr[i] = dist;
            }else{
                dist++;
                arr[i] = Math.min(dist, arr[i]);
            }
        }

        for(int temp : arr){
            System.out.print(temp + " ");
        }




        return ;
    }
}