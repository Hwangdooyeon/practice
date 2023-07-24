import java.util.Scanner;

public class Baekjoon2579 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        int answer = 0;
        if (n == 1) {
            answer = arr[0];
        } else if (n == 2) {
            answer = arr[0] + arr[1];
        } else {
            dp[0] = arr[0];
            dp[1] = arr[1] + arr[0];
            dp[2] = arr[2] + Math.max(arr[1], arr[0]);


            for (int i = 3; i < n; i++) {
                dp[i] = arr[i] + Math.max(dp[i - 2], arr[i - 1] + dp[i - 3]);
            }
            answer = dp[n - 1];
        }
            System.out.println(answer);
        }
    }


