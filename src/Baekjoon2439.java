import java.util.Scanner;

public class Baekjoon2439 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=1; i<=N; i++){
            for (int w = 0; w < -1*i + N; w++){
                System.out.print(" ");
            }

                for (int w = 0; w < i; w++){
                    System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}