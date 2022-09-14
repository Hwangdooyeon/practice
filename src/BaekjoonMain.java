import java.util.Scanner;

public class BaekjoonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sugar = 0;

        while (true) {
            if (number % 5 == 0) {
                sugar += number / 5;
                System.out.println(sugar);
                break;
            }

            number -= 3;
            sugar++;

            if (number< 0) {
                 System.out.println("-1");
                 break;
            }
        }
    }
}