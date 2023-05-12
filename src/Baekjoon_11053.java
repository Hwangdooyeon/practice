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
            for (int j=i; j<n; j++){
                if (A[i] < A[j]){
                    dp[j] = Math.max(dp[j], dp[i]+1);
                   answer = Math.max(answer, dp[j]);

                }
            }
        }
        System.out.println(answer);
    }
}

