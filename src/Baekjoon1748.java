import java.util.Scanner;

public class Baekjoon1748 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        int cnt = 1;
        int length = 10;
        int answer = 0;
        for (int i=1; i<=n; i++){

            if (i==length){

                length *= 10;

                cnt ++;
            }
            answer +=cnt;
        }
        System.out.println(answer);

    }
}
