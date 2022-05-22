import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][4];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 4 ; j++){
                arr[i][j] = st.nextToken();
            }
        }


        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[1].equals(o2[1])){

                    if(o1[2].equals(o2[2])){

                        if(o1[3].equals(o2[3])){
                            return o1[0].compareTo(o2[0]);
                        }else{
                            return Integer.parseInt(o2[3])-Integer.parseInt(o1[3]);
                        }

                    }else{
                        return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
                    }
                }

                return Integer.parseInt(o2[1])-Integer.parseInt(o1[1]);
            }
        });

        for(int i = 0 ; i < N ; i++){
            sb.append(arr[i][0] + "\n");
        }

        System.out.println(sb);


    }


}
