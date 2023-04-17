import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon15552_ {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(bf.readLine());

        StringTokenizer  st;

        int a = 0;
        int b = 0;
        int sum = 0;

        for (int i=0; i<T; i++){

            st = new StringTokenizer(bf.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            sum = a+b;

            bw.write(sum+"\n");
        }
        bw.flush();
        bf.close();
    }
}
