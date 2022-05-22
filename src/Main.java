import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static boolean flag = false;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();

        while( N-->0){
            char[] ch = br.readLine().toCharArray();

            for(int i = 0 ; i < ch.length ; i++){
                if(ch[i] == '('){
                    stack.push(ch[i]);
                }else{
                    if(stack.isEmpty()){
                        sb.append("NO\n");
                        flag = true;
                        break;
                    }else {
                        stack.pop();
                        continue;
                    }
                }
            }

            if(stack.isEmpty() && !flag){
                sb.append("YES\n");
            }else if(!stack.isEmpty() && !flag)
                sb.append("NO\n");

            flag = false;

            stack.clear();
        }

        System.out.println(sb);
    }


}
