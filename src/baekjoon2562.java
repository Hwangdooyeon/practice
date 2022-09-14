import java.util.Scanner;

public class baekjoon2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int index =0 ;

        for (int i = 0; i < 9; i++) {
            int u = sc.nextInt();
            if (max < u) {
                max = u;
                index = i;

            }
        }



        System.out.println(max);
        System.out.println(index);

    }
}

