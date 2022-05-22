import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();

        int num = 0;

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] == '('){
                stack.push(ch[i]);
                continue;
            }
            if(ch[i] == ')'){
                stack.pop();

                if(ch[i-1] == '('){
                    num += stack.size();
                }else{
                    num ++;
                }

            }

        }

        System.out.println(num);
    }


}
