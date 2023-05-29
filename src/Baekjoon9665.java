import java.util.Scanner;

public class Baekjoon9665 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();

        if(n % 2==1){

            System.out.println("SK");
        }
        else {
            System.out.println("CY");
        }
    }
}
