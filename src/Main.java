import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = "";

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        long num = 0;

        for(int i = N.length() -1  ; i >= 0 ; i--){

            if((int)(N.charAt(i)) >= 58){
                num += ((int)N.charAt(i) - 55)*Math.pow(B,N.length() - 1 - i);
            }else{
                num += ((int)N.charAt(i) - 48)*Math.pow(B,N.length() - 1 - i);
            }
        }

        System.out.println(num);


    }

}





