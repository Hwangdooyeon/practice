import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("국어:");
        int a = number.nextInt();
        System.out.print("수학:");
        int b = number.nextInt();
        System.out.print("영어:");
        int c = number.nextInt();


        double All = a + b + c;

        System.out.println("평균:"+All/3);


    }

}
