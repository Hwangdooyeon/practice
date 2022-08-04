import java.util.Scanner;

public class Dsolution8 {
    public static void main(String[] args) {
        Scanner bye = new Scanner(System.in);
       String str = bye.nextLine();

       for(int i= str.length()-1; i>=0; i--){
           System.out.print(str.charAt(i));
       }



    }
}