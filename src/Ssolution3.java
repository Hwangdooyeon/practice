import java.util.Scanner;

public class Ssolution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[11];

        int sum = 0;
        int average = 0;

        for (int i = 0; i < 11; i++) {

            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {


            sum += arr[i];
            average = sum / arr.length;
        }
        System.out.println(sum);
        System.out.println(average);
    }
}
