import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon55972 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < 28; i++) {

            int N = sc.nextInt();

            list.add(N);
        }
        list.add(0);
        list.add(31);
        Collections.sort(list);
        for (int u = 0; u < 29; u++) {
            list.get(u + 1);

            if (list.get(u + 1) - list.get(u) == 2) {

                System.out.println(list.get(u) + 1);
            }
            if (list.get(u + 1) - list.get(u) == 3) {

                System.out.println(list.get(u) + 1);
                System.out.println(list.get(u) + 2);
            }
        }
    }
}
