import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = -1000000 ;
        int max = 1000000 ;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (max >= arr[i]) {
                max = arr[i];

            }
            if (min <= arr[i]) {
                min = arr[i];
                System.out.println();
            }
        }
        System.out.println(max + " " + min);
    }
}

