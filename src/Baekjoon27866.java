import java.util.Scanner;

public class Baekjoon27866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int i = sc.nextInt();

       char[] num = S.toCharArray();

        System.out.println(num[i-1]);
    }
}