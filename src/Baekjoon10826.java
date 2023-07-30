import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon10826 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();

        BigInteger dp[] = new BigInteger[n+1];

        dp[0] = new BigInteger("0");
        dp[1] = new BigInteger("1");
            for (int i=2; i<=n; i++){
                dp[i] = dp[i-1].add(dp[i-2]);
            }
        System.out.println(dp[n]);
        }
    }

