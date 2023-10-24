import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Baekjoon1920 {
    final static Scanner sc = new Scanner(System.in);
    private static int bSearch(int[] arr, int m){
        int left = 0; int right = arr.length-1; int mid = left+right/2;
        while (left<=right){
            if (arr[mid]==m){
                return 1;
            }
            else if (arr[mid] < m){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
            mid = (left + right)/2;
        }
        return 0;
    }
    public static void main(String[] args){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){

            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int M = sc.nextInt();
        for (int i=0; i<M; i++){
            int m = sc.nextInt();
            int answer = bSearch(arr, m);
            System.out.println(answer);
        }
    }
}






