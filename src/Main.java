import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";

        while((str=br.readLine()) != null){

            char[] ch = str.toCharArray();
            int[] arr = new int[4];

            for(int i = 0 ; i < ch.length ; i++){

                int ascii = (int)ch[i];
                if(ascii == 32){
                    arr[3] += 1;
                }else if( ascii >= 48 && ascii <= 57){
                    arr[2] += 1;
                }else if(ascii >= 65 && ascii <= 90 ){
                    arr[1] += 1;
                }else{
                    arr[0] += 1;
                }
            }

            System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        }

    }


}
