import java.util.Scanner;

public class Ssolution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[11];

        for (int i = 0; i < 11; i++) {

            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 40 || arr[i] == 50 || arr[i] == 60) {

                System.out.print(arr[i]+", ");
            }
        }
    }
}
