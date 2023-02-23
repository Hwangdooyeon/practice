import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Baekjoon3052_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] arr = new int[42];
        for (int i = 0; i < 10; i++) {

            int A = sc.nextInt();

            arr[A % 42] = 1;

        }

        for (int i = 0; i <= 10; i++) {

            if (arr[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}


