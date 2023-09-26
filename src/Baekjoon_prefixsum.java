import java.util.Scanner;

public class Baekjoon_prefixsum {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int n = sc.nextInt();
        int k = sc.nextInt();
        int A[] = new int[n];
        int dp[] = new int[n+1];


        for (int i = 0; i<n; i++){

            A[i] = sc.nextInt();
        }

        dp[0] = A[0];

        for (int i=1; i<n; i++){

          dp[i] = dp[i-1] + A[i];

        }
        int maxV = -10000001;
        for (int i=k; i<n-1; i++){
            maxV = Math.max(maxV, dp[i]- dp[i-k]);

            }
            System.out.println(maxV);

        }
    }
