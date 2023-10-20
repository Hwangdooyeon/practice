import java.util.Scanner;

public class Baekjoon1110 {

    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();

        int cnt = 0;
        int answer = n;

        while (true){

            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            cnt++;
            if (answer==n){
                break;
            }
        }
        System.out.println(cnt);
    }
}
