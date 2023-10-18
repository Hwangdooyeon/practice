import java.util.Scanner;

public class Baekjoon_11053 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        int A[]  = new int[n];
        int dp[] = new int[n];

        for (int i=0; i<n; i++){

            A[i] = sc.nextInt();

            dp[i] = 1;
        }
        int answer =1;
        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){

                if (A[i] > A[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                   answer = Math.max(answer, dp[i]);
                }
                //System.out.println("i: " + i + ", j: " + j + ", dp[i]: " + dp[i] + ", dp[j]: " + dp[j]);
                System.out.printf("i: %d, j: %d, dp[%d]: %d, dp[%d]: %d \n ",i,j,i,dp[i],j,dp[j]);

            }
        }

        System.out.println(answer);
    }
}

