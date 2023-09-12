import java.util.Arrays;
import java.util.Scanner;
public class Baekjoon10816 {
    final static Scanner sc = new Scanner(System.in);
    private static int upper(int[] arr,int M){
        int left = 0;
        int right = arr.length;
        while (left < right){
            int mid = (left+right)/2;
            if (arr[mid] > M){
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
    private static int lower(int[] arr, int M){
        int left = 0;
        int right = arr.length;
        while (left < right){
            int mid = (left+right)/2;
            if (arr[mid] >= M){

                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args){

        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i=0; i<n; i++){

            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<m; i++){

            int M = sc.nextInt();
            sb.append(upper(arr, M) - lower(arr, M)).append(" ");
        }
        System.out.println(sb);
    }
}
