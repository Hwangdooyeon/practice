import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon2750 {
    final static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        int [] arr = new int[N];

        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);

        for (int i=0; i<N; i++){
            System.out.println(arr[i]);
        }
    }
}
