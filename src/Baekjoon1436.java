import java.util.Scanner;

public class Baekjoon1436 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int N = sc.nextInt();
        int cnt = 0;
        int answer = -1;

        for (int i=666; ; i++) {
            if (("" + i).contains("666")) {
                cnt++;
            }
            if (cnt == N) {
                answer = i;
                break;
            }
        }
            System.out.println(answer);
    }
}
