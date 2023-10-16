import java.util.Scanner;

public class Baekjoon2851 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int sum =0;
        int result = 100;
        int answer = 0;

        for (int i = 0; i < 10; i++) {

            sum += sc.nextInt();


            if (Math.abs(100-sum) <= result){

                result = Math.abs(100-sum);

                answer = sum;
            }
        }
        System.out.println(answer);
    }
}

