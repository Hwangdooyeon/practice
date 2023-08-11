import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10817 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int[] n = new int[3];

        for (int i=0; i<n.length; i++){

            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        System.out.println(n[1]);
    }
}
