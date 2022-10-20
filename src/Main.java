import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        String str = in.next();

        char[] arr = str.toCharArray();

        int lt = 0 , rt = arr.length - 1;

        while( lt < rt){

            if(!Character.isAlphabetic(arr[lt]))    lt++;
            else if(!Character.isAlphabetic(arr[rt]))   rt--;
            else{
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }



        System.out.println(new String(arr));

        return ;
    }
}