import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        sb.append( (A+B)%C + "\n");
        sb.append( ((A%C) + (B%C))%C + "\n");
        sb.append( (A*B)%C + "\n");
        sb.append( ((A%C)*(B%C))%C + "\n");


        System.out.println(sb);
    }
}





