import java.util.Scanner;

public class Baekjoon11 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            for (int u = 0; u < -1 * i + T; u++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }
//}