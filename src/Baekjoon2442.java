import java.util.Scanner;

public class Baekjoon2442 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            for (int j=0; j<-1*i +n-1; j++){
                System.out.print(" ");
            }

            for (int k=0; k<2*i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
