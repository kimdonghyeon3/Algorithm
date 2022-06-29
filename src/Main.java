import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = "";

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        ArrayList<Character> list = new ArrayList<>();

        while( N > 0 ){

            if(N % B >= 10){
                list.add((char)(N % B - 10 + 'A'));
            }else{
                list.add((char)(N % B + '0'));
            }

            N = N/B;
        }

        for(int i = list.size() -1 ; i >= 0 ; i--){
            sb.append(list.get(i));
        }

        System.out.println(sb);

    }

}





