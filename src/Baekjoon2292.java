import java.util.Scanner;

public class Baekjoon2292 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        int cnt = 1;

        for (int i=0; i<n; i++){

            cnt += i*6;


            if (n==1){

                System.out.println(1);

                break;

            }
            if (n<=cnt){
                System.out.println(i+1);

                break;
            }
        }
    }
}
