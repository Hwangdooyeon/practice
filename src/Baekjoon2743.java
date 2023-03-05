import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2743 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 0;

        String N = sc.next();


        for (int u=0; u<N.length(); u++){

            count++;

        }
        System.out.println(count);
    }
}
