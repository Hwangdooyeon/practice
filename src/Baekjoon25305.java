import javax.swing.text.Style;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon25305 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer arr[] = new Integer[n];

        for (int i=0; i<n; i++){

            arr[i] = sc.nextInt();
        }
           Arrays.sort(arr, Collections.reverseOrder());

           System.out.println(arr[k-1]);
        }
    }


