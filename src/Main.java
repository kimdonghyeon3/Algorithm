import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] arr;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        while( N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(st.hasMoreTokens()){
                stack.push(Integer.parseInt(st.nextToken()));
            }else{
                if(command.equals("pop")){
                    if(stack.isEmpty()){
                        sb.append("-1" + "\n");
                    }else{
                        sb.append(stack.pop()+"\n");
                    }
                }else if(command.equals("size")){
                    sb.append(stack.size() + "\n");
                }else if(command.equals("empty")){
                    if(stack.isEmpty()){
                        sb.append("1" + "\n");
                    }else
                        sb.append("0" + "\n");
                }else if(command.equals("top")) {
                    if(stack.isEmpty()){
                        sb.append("-1" + "\n");
                    }else{
                        sb.append(stack.peek() + "\n");
                    }
                }
            }

        }

        System.out.println(sb);
    }


}
