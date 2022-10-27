import java.awt.*;
import java.util.Scanner;

public class Baekjoon17615 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int a = 0;
        int b = 1;

        for (int i=1; i<num; i++){

            int su = a+b;
            a=b;
            b=su;
        }
        System.out.println(a+" "+b);
    }
}
