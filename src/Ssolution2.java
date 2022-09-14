import java.util.Scanner;

public class Ssolution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }
        for (int u = 0; u < arr.length; u++) {

            if (arr[u] == 50) {

                System.out.println(u);
            }
        }
    }
}