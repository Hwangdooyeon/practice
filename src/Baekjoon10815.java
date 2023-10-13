import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10815 {
    final static Scanner sc = new Scanner(System.in);

    private static int Bsearch(int[] arr, int M) {
        int left = 0;
        int right = arr.length - 1;
        int mid = left + right / 2;

        while (left <= right) {
            if (arr[mid] == M) {
                return 1;
            } else if (arr[mid] < M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        return 0;
    }

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int M = sc.nextInt();
                int answer = Bsearch(arr, M);
                System.out.println(answer);
            }
        }
    }
}