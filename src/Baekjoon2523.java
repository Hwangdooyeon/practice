import java.util.Scanner;

public class Baekjoon2523 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int star = sc.nextInt();

        for (int i=1; i<=star; i++){
            for (int j=0; j<i; j++){

                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=star; i++){
            for (int j=0; j<-1*i + star; j++){

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
