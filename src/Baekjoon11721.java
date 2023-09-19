import java.util.Scanner;

public class Baekjoon11721 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

      String s = sc.nextLine();

      for (int i=1; i<=s.length(); i++){
          System.out.print(s.charAt(i-1));
          if (i%10==0 && i!=0){
              System.out.println();
          }
      }
    }
}
