import java.util.Scanner;

public class Baekjoon2444 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            for (int j=0; j<(i*-1)+n-1; j++){
                System.out.print(" ");
            }
            for (int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=n; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<-2*i + (n*2-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
