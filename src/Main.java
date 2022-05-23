import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();
        int[] arr = new int[26];

        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = -1;

        for(int i = 0 ; i < ch.length ; i++){
            if(arr[ch[i] - 'a'] == -1)
                arr[ch[i] - 'a'] = i;
        }

        for(int a : arr)
            sb.append(a +" ");

        System.out.println(sb);
    }


}
