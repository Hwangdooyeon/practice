import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Baekjoon11055 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        int arr[] = new int[n+1];
        int dp[] = new int[n+1];

        for (int i=1; i<n; i++){

            arr[i] = sc.nextInt();

            dp[1] = arr[1];
        }
        int answer = dp[1];

        for (int i=2; i<n; i++){
            dp[i] = arr[i];
            for (int j=1; j<i; j++){
                if (arr[i] > arr[j]){

                    dp[i] = Math.max(dp[i], dp[j]+arr[i]);
                }
            }
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}
