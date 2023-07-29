import java.util.Scanner;

public class Baekjoon1145 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int A[] = new int[5];
        int cnt = 0;
        int num = 1;
        for (int i = 0; i < 5; i++) {

            A[i] = sc.nextInt();
        }
        while (true) {

            cnt = 0;

            for (int i = 0; i < 5; i++) {
                if (num % A[i] == 0)
                    cnt++;
            }
            if (cnt >= 3) {
                break;
            }
            num++;
        }
        System.out.println(num);
    }

}