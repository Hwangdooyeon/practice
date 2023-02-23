import java.util.Scanner;

public class Baekjoon10872 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = fibo(N);
        System.out.println(result);

    }
    public static int fibo (int N){
        if (N==0){
            return 1;

        }
        if (N==1){
            return 1;
        }
        return N * fibo(N-1);
    }
}

        /*int sum=1;


        while (N != 0){
            sum = sum * N;
            N--;
        }
        System.out.print(sum);
        }
    }

*/