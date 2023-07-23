import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1037 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){

            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);


            System.out.println(arr[0] * arr[n-1]);
        }
    }

