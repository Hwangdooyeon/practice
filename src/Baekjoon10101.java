import java.util.Scanner;

public class Baekjoon10101 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A+B+C;


        if (A==60 && B==60 && C==60){
            System.out.println("Equilateral");
        } else if(sum == 180 && (A == B || B == C || A == C)){
            System.out.println("Isosceles");
        }
        if (sum == 180 && A!=B && B!=C && A!=C){

            System.out.println("Scalene");
        }
        if (sum != 180){
            System.out.println("Error");
        }
    }
}

