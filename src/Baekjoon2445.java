import java.util.Scanner;

public class Baekjoon2445 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < -2 * i + (2 * n - 2); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j=0; j<2*n -i-1; j++){ // -1*i + a
                    System.out.print("*");
                }
                for (int j=0; j<2*i + (-2*n+2); j++){
                    System.out.print(" ");
                }
                for (int j=0; j<2*n -i-1; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}