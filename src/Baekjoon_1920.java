import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {

            array.add(sc.nextInt());
        }

        Collections.sort(array);


        ArrayList<Integer> array1 = new ArrayList<>();

        int M = sc.nextInt();

        for (int u = 0; u < M; u++) {

            array1.add(sc.nextInt());

            if (array.contains(array1.get(u))){

            System.out.println("1");

        }else{
                System.out.println("0");
            }
        }
    }
}
