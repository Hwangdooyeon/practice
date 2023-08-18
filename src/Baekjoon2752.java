import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2752 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int arr[] = new int[3];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}

