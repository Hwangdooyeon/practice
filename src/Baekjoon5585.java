import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon5585 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int arr[] = new int[]{500, 100, 50, 10, 5, 1};
            int N = 1000;
            int S = sc.nextInt();
            int result = 0;
            int count =0;


            for (int i = 0; i < arr.length; i++) {

                result = N - S;

                if (result / arr[i] > 0) {



                }
                System.out.println(count);
            }
        }
    }

