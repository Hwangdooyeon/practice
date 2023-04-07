import javax.script.ScriptContext;
import java.util.Scanner;

public class Baekjoon10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = fibonacci(num);
        System.out.println(result);
    }

    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}