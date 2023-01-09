import java.util.Scanner;

public class Pyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();

        for (int i = 1; i <= star; i++) {
            for (int w = 0; w < i - 1; w++) {
                System.out.print(" ");
            }

            for (int w = 0; w <  i * -2 + (star * 2 + 1); w++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
/*for (int j= star - (i-1); i>=1; i--)*/