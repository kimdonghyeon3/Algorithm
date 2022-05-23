import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int last_num;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        while( N-->0){

            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if(st.hasMoreTokens()){
                last_num = Integer.parseInt(st.nextToken());
                q.add(last_num);
            }else{

                if(command.equals("pop")){
                    if(q.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(q.poll() + "\n");
                    }
                }else if(command.equals("size")){
                    sb.append(q.size() + "\n");
                }else if(command.equals("empty")){
                    if(q.isEmpty()){
                        sb.append("1\n");
                    }else{
                        sb.append("0\n");
                    }
                }else if(command.equals("front")){
                    if(q.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(q.peek() + "\n");
                }else if(command.equals("back")){
                    if(q.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(last_num + "\n");
                }
            }

        }



        System.out.println(sb);
    }


}
