import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon11004 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++){

            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[K-1]);
    }
}

//StringTokenizer