import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String ab = st.nextToken() + st.nextToken();
        String cd = st.nextToken() + st.nextToken();

        System.out.println(Long.parseLong(ab) + Long.parseLong(cd));

    }


}
