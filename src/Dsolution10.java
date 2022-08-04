import java.util.Scanner;

public class Dsolution10 {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 1,}, {1, 1, 1, 1}};
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오");
        int sum = 0;

        for (int i = 0; i < 20; i++) {


            {

                sum += i;
                System.out.println(sum);
            }
        }
    }
}