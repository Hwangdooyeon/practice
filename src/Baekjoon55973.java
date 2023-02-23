import java.util.Scanner;

public class Baekjoon55973 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[31];

        for (int i=0; i<28; i++){

            int N = sc.nextInt();

            arr[N] = 1;
        }
        for (int u=1; u < arr.length; u++){

            if(arr[u]==0){
                System.out.println(u);
            }
        }
    }
}
