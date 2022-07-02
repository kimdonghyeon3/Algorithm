import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int cnt = 0;
        int sum = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1 ; i >= 0 ; i--){

            sum += Math.pow(2,cnt)*Character.getNumericValue(str.charAt(i));

            if( cnt % 2 == 0 && cnt != 0){
                sb.append(sum);
                sum = 0;
                cnt = 0;
                continue;
            }
            cnt++;
        }

        if(sum != 0)
            sb.append(sum);

        System.out.print(sb.reverse());
    }

}





