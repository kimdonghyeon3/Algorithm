
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        StringBuilder sb = new StringBuilder();

        int[] arr = new int[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(in.next());
        }

        for(int i = 0 ; i  < arr.length  ; i++){
            int num = 1;
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i] < arr[j]){
                    num++;
                }
            }
            sb.append(num + " ");
        }




        System.out.println(sb);
    }
}