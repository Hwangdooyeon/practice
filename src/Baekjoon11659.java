import java.util.Scanner;

public class Baekjoon11659 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] dp = new int[n+1];

        for (int i=0; i<n; i++){

            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){

            dp[i+1] = dp[i] + arr[i];
        }
        for (int s=0; s<m; s++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(dp[y] - dp[x-1]);
        }
    }
}
