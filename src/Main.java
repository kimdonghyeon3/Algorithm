import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static long[] arr = new long[100001];
    static long max = 0;
    static long index = 0;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < N ; i++){
            String temp = br.readLine();
            if(map.containsKey(temp))
                map.replace(temp,map.get(temp)+1);
            else
                map.put(temp,1);
        }

        for(String key : map.keySet()){
//            System.out.println("key : " + key + " value : " + map.get(key));
            if(max < map.get(key)){
                max = map.get(key);
                index = Long.parseLong(key);

            }else if(max == map.get(key)){
                if(index > Long.parseLong(key)) {
                    index = Long.parseLong(key);
                }
            }
        }

        System.out.println(index);


    }


}
