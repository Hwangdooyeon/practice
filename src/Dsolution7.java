import java.util.Arrays;
import java.util.Scanner;

public class Dsolution7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요");

        int number = num.nextInt();
        int[] text = new int[number];

        for (int i = 0; i < text.length; i++) {
            text[i] = num.nextInt();
        }
            Arrays.sort(text);

            System.out.println(text[0] + " " + text[number-1]);

        }


    }


