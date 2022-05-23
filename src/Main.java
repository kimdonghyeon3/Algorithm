import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();

        for(int i = 0 ; i < ch.length ; i++){

            int num = ch[i];

            if(ch[i] >= 65 && ch[i] <= 90){
                num += 13;

                if (num > 90)
                    num = 64 + (num - 90);

            }else if(ch[i] >= 97 && ch[i] <= 122){
                num += 13;

                if (num > 122)
                    num = 96 + (num - 122);
            }
                ch[i] = (char) num;
        }
        for(char c : ch){
            System.out.print(c);
        }


    }


}
