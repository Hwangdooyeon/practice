import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon {
    final static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){

        List<Integer> list = new ArrayList();

        int T = sc.nextInt();
        for (int i = 0; i < T; i++){

            int A =sc.nextInt();
            int B =sc.nextInt();
            list.add(A+B);
        }

        for (int u=0; u<T; u++){
            System.out.println(list.add(T));
        }
    }
}
