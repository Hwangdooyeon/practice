import java.util.Scanner;

public class Baekjoon3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합");
        int n = sc.nextInt();
        int sum = 0;
        {

            for (int i = 1; i <=n; i++) {
               sum += i;
                System.out.println(sum);
            }


        }
    }
}