import java.util.Scanner;

public class Baekjoon2748 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();

        long dp[] = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;


        for (int i=2; i<=n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];

        }
            System.out.println(dp[n]);
    }
}
