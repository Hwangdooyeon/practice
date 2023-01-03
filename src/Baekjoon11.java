import java.util.Scanner;

public class Baekjoon11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++) {
            for (int u=T-(i-1); u>=i; u--){
                System.out.print("*");
            }
            System.out.println("\n");
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