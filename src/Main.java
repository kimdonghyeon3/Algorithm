import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int last_num;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> q = new LinkedList<>();

        while( N-->0){

            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if(st.hasMoreTokens()){
                if(command.equals("push_front")){
                    q.addFirst(Integer.parseInt(st.nextToken()));
                }else{
                    q.addLast(Integer.parseInt(st.nextToken()));
                }
            }else{

                if(command.equals("pop_front")){
                    if(q.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(q.pollFirst() + "\n");
                    }
                }else if(command.equals("pop_back")){
                    if(q.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(q.pollLast() + "\n");
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
                        sb.append(q.getFirst() + "\n");
                }else if(command.equals("back")){
                    if(q.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(q.getLast() + "\n");
                }
            }

        }



        System.out.println(sb);
    }


}
