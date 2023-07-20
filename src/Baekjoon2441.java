import java.util.Scanner;

public class Baekjoon2441 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int star = sc.nextInt();
        for (int i=0; i<star; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int w=0; w<-1*i +star; w++ ){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
