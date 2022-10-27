import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);

        for(int i = 2 ; i < N ; i++){
            list.add(list.get(i-1) + list.get(i-2));
        }

        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i) + " ");
        }

    }
}