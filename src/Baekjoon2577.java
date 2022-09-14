import java.util.Scanner;

public class Baekjoon2577 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int number =A*B*C;
        int[] cnt = new int[10];

        while (number >0){

            cnt[number % 10]++;
            number/= 10;

        }
        for (int i=0; i< cnt.length; i++){
            System.out.println(cnt[i]);
        }
    }
}
