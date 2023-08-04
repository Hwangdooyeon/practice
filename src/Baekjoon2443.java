import java.util.Scanner;

public class Baekjoon2443 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int star = sc.nextInt();

        for (int i=0; i<star; i++){
            for (int w=0; w < i; w++){
                System.out.print(" ");
            }
            for (int w=0; w<-2*i + (star*2-1); w++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
