import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon11047 {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            }

        for (int i=n-1; i>=0; i--){

            if(arr[i]<=k){
                cnt += (k/arr[i]);
                k = (k % arr[i]);
                }
            }
        System.out.println(cnt);
        }
}


