import java.util.Scanner;
import java.util.Scanner;

public class Baekjoon1978 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int number;
        int cnt = 0;

        for (int i = 0; i < n; i++) {

            number = sc.nextInt();

            for (int x = 2; x <= number; x++) {

                if (x==number){
                    cnt++;
                }
                if (number % x==0){
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}

