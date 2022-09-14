import java.util.Scanner;

public class Ssolution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[11];

        for (int i = 0; i < 11; i++) {

            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 30) ;

        else{
                System.out.print(arr[i]+", ");
            }
        }
    }
}