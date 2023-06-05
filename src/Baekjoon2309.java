import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2309 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int arr[] = new int[9];
        int sum = 0;
        int another1 = 0;
        int another2 = 0;

        for (int i=0; i<arr.length; i++){

            arr[i] = sc.nextInt();

            sum+=arr[i];
        }
        Arrays.sort(arr);

       for (int i=0; i<arr.length; i++){
           for (int j=i+1; j<arr.length; j++){
               if (sum - arr[i] - arr[j] == 100){

                   another1 = i;
                   another2 = j;

                   break;
               }
           }
       }
       for (int i=0; i<arr.length; i++){
           if (i==another1 || i==another2)
               continue;
           System.out.println(arr[i]);
       }
    }
}
