import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9093 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = null;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        for (int i=0; i<n; i++){
            String[] arr = bf.readLine().split(" ");

            for (int k=0; k<arr.length; k++){

                sb = new StringBuilder(arr[k]);
                String s = sb.reverse().toString();
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
