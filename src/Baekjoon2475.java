import java.util.Scanner;

public class Baekjoon2475 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int answer = 0;

        for (int i=0; i<5; i++){

            int n = sc.nextInt();

            answer += Math.pow(n , 2);
        }
        System.out.println(answer%10);
    }
}
