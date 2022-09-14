import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon11399 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();

        }
        Arrays.sort(arr);

        int time =0;
        int wait =0;

        for (int i=0; i<n; i++){

            wait +=arr[i];

            time += wait;
        }
        System.out.println(time);
    }
}
