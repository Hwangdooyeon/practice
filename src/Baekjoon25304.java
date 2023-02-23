import java.util.Scanner;

public class Baekjoon25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int N = sc.nextInt();

        for (int u=0; u<N; u++){
            int a = sc.nextInt();
            int b = sc.nextInt();

          total = total - (a*b);

        }if (total==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


