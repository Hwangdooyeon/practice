import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < N; i++) {

            bw.write(Integer.toString(arr[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}