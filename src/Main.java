import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] ch = br.readLine().toCharArray();

        int N = Integer.parseInt(br.readLine());

        Stack<Character> stack_left = new Stack<>();
        Stack<Character> stack_right = new Stack<>();

        for(int i = 0 ; i < ch.length ; i++){
            stack_left.push(ch[i]);
        }

        for(int i = 0 ; i < N ; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(st.hasMoreTokens()){
                stack_left.push(st.nextToken().charAt(0));
            }else{
                if(command.equals("L")) {
                    if(!stack_left.isEmpty()){
                        stack_right.push(stack_left.pop());
                    }
                }else if(command.equals("D")){
                    if(!stack_right.isEmpty()){
                        stack_left.push(stack_right.pop());
                    }
                }else if(command.equals("B")){
                    if(!stack_left.isEmpty()){
                        stack_left.pop();
                    }
                }
            }
        }   //for end

        while(!stack_left.isEmpty()){
            stack_right.push(stack_left.pop());
        }

        while(!stack_right.isEmpty())
            sb.append(stack_right.pop());

        System.out.println(sb);
    }
}





