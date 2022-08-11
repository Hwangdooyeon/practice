import java.lang.module.FindException;
import java.util.Arrays;
import java.util.Scanner;

public class Dsolution2 {
    public static void main(String[] args) {
        int[] arr = new int[11];


        System.out.println("0부터 100까지 숫자를 넣어주세요");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {

            int index = sc.nextInt();

            System.out.println(index);

        }

    }
}
