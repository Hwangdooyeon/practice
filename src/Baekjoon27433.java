import java.util.Scanner;

public class Baekjoon27433 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      long N = sc.nextLong();
      long sum = 1;


      while (N != 0){
          sum = sum * N;
          N--;

      }
      System.out.println(sum);
       }
    }




