import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Baekjoon10989 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        int arr[] = new int[n];

        for (int i=0; i<n; i++){

            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);

        for (int i=0; i<n; i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}