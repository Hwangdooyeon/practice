import java.util.Arrays;
import java.util.Scanner;

public class Homework55 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.print("수:");
        int n =sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
}
