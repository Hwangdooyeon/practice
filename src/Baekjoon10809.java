import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10809 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int [] arr = new int[26];

        Arrays.fill(arr, -1);
        String s = sc.nextLine();

        for (int i=0; i<s.length(); i++){
            char le = s.charAt(i);
          int index = ((int)le) -97;
          if (arr[index]== -1){
              arr[index] = i;
          }
        }
        for (int i=0; i<arr.length; i++){
            int sum = arr[i];
            System.out.print(sum+ " ");
        }
    }
}
