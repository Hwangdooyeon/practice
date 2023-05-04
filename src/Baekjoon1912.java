import java.util.Scanner;

public class Baekjoon1912 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        int dt[] = new int[n];

        for (int i=0; i<n; i++){

            dt[i] = sc.nextInt();
        }
        int dp[] = new int[n];

        dp[0] = dt[0];

        int answer = dp[0];

        for(int i=1; i<n; i++){

            dp[i] = Math.max(dt[i], dp[i-1]+dt[i]);
                answer = Math.max(answer, dp[i]);
            }
            System.out.println(answer);
        }
    }

