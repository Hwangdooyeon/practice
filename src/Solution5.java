import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         int number = scanner.nextInt();

         for (int i=1; i<=number; i++){
             for (int j=number-(i-1); j>=1; j--){
                 System.out.print("*");
             }
             System.out.println("");
         }
    }
}
