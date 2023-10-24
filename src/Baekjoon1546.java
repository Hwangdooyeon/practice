import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오");
        int n = sc.nextInt();
        double arr[] = new double[n];
        double sum = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);

        for (int i=0;i<arr.length;i++ ){

            arr[i] = arr[i]/arr[arr.length-1]*100;

            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }
}