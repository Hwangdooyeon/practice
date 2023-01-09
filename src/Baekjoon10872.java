import java.util.Scanner;

public class Baekjoon10872 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum=1;


        while (N != 0){
            sum = sum * N;
            N--;
        }
        System.out.print(sum);
        }
    }

