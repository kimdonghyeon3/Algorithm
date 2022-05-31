import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1 ; i <= N ; i++){
            q.add(i);
        }

        int cnt = 1;

        sb.append("<");

        while(!q.isEmpty()){

            if(cnt == K){
                sb.append(q.poll() + ", ");
                cnt = 1;
            }else{
                q.add(q.poll());
                cnt++;
            }
        }

        sb.setLength(sb.length()-2);
        sb.append(">");

        System.out.println(sb);
    }
}





