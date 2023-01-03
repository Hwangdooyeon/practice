import java.util.Scanner;

public class Baekjoon4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();


        for (int i = 0; i < testcase; i++) {
            int C = sc.nextInt();
            int arr[] = new int[C];
            int sum = 0;



            for (int j = 0; j < C; j++) {

              int number = sc.nextInt();

              arr[j] = number;

                sum += number;
            }
            double average = sum / C;
            double cnt = 0;
            for (int j = 0; j < C; j++) {

                if (arr[j] > average) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",( cnt/C)*100);
        }
    }
}

// sum = arr.length+sum;
//double average = sum/arr.length;
//
//        System.out.println(average);



