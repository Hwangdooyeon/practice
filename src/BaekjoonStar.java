import java.util.Scanner;

public class BaekjoonStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            for (int u = 1; u <= i; u++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
