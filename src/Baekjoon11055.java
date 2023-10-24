import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Baekjoon11055 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        int arr[] = new int[n];
        int dp[] = new int[n];

        for (int i=0; i<n; i++){

            arr[i] = sc.nextInt();

            dp[i] = arr[i];
        }
        int answer = 0;

        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){
                if (arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], dp[j]+arr[i]);
                }
            }
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}
