import java.util.Scanner;

public class Baekjoon2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int min = sc.nextInt();
        int plustime = sc.nextInt();


        total = (total * 60 + min + plustime);

           if (total>24){
               total =total % 1440;
           }

        System.out.print(total / 60 + " ");
        System.out.println(total % 60);

        }
    }
