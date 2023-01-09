import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j=0; j<-1*i + (number-1); j++ ) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

