import java.util.Scanner;

public class Baekjoon2559 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();
        int maxV = -10000000;
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {

            A[i] = sc.nextInt();
        }

        for (int u=0; u<=n-k; u++){
            int sum = 0;
            for (int x=u; x<u+k; x++){

                sum += A[x];


            }
            if (maxV < sum){

                maxV = sum;
            }
        }
        System.out.println(maxV);
    }
}

