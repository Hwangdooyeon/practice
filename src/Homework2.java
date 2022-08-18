import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 0;

        System.out.println("자연수:");

        n=sc.nextInt();

        if (n%2==1) {
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
