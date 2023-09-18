import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon11652 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i=0; i<n; i++){

            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        long check = arr[0];
        int cnt = 1;
        int max = 1;

        for (int i=1; i<n; i++){

            if (arr[i]==arr[i-1]){
                cnt++;
            }
            else{
                cnt=1;
            }
            if (max<cnt){
                max = cnt;
                check = arr[i];
            }
        }
        System.out.println(check);
    }
}
