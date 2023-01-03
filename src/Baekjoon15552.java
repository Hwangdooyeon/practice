import java.util.Scanner;

public class Baekjoon15552 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);


        int a=0;
        int b=0;
        int T = ab.nextInt();

        for (int i=1; i<=T; i++){

            a = ab.nextInt();
            b = ab.nextInt();

            System.out.println("Case #" + (i) + ": "+ a+" + "+b +  " = " + (a + b));
        }

            }
        }



