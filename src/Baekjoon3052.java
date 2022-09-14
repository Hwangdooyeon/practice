import java.util.Scanner;

public class Baekjoon3052 {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);

        int[] arr = new int[10];
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = su.nextInt();

        }

        for (int i = 0; i < 10; i++) {

            System.out.println(num[i] = arr[i] % 42);


        }
    }

}

