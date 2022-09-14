import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ssolution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 11; i++) {

            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("숫자를 입력해 주세요");
        int index = sc.nextInt();
        int number = 1000;

        int temp = list.get(index);
        list.set(index, number);

        for (int i = 0; i < 11; i++) {

            System.out.print(list.get(i)+", ");
        }
    }
}