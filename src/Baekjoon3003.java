import java.util.Scanner;

public class Baekjoon3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int min = sc.nextInt();

        total = (total * 60+min)-45;

        System.out.print(total/60 + " ");
        System.out.print(total%60 + " ");

    }
}
