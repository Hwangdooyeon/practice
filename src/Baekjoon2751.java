
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon2751 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());

        int arr[] = new int[N];

        for (int i=0; i<N; i++){

            arr[i] = Integer.parseInt(bf.readLine());

        }
        Arrays.sort(arr);

        for (int i=0; i<N; i++){
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}

