import java.util.Scanner;

public class Baekjoon2440 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int star = sc.nextInt();

        for (int i=1; i<=star; i++){
            for (int j=i; j<star+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
