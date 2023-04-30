import java.util.Scanner;

public class Baekjoon2501 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();
        int count =0;
        int result =0;

        for (int i = 1; i <= n; i++) {

            if (n%i==0){
                count++;

            }
            if (count==k){
                result = i;

            }
        }
        System.out.println(result);
    }
}
