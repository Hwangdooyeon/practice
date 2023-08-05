import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2576 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] A = new int[7];
        int answer = 100;
        int sum = 0;
        for (int i = 0; i < 7; i++) {

            A[i] = sc.nextInt();

            if (A[i] % 2 == 1) {

                sum += A[i];

                answer = Math.min(answer, A[i]);
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(answer);
        }
    }
}



