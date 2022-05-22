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

        int[][] arr = new int[N][2];

        String[] s = new String[N];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            s[i] = st.nextToken();
            arr[i][1] = i;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o1[0]-o2[0];
            }
        });

        for(int i = 0 ; i < N ; i++){
            sb.append(arr[i][0] +" " + s[arr[i][1]] + "\n");
        }

        System.out.println(sb);


    }


}
