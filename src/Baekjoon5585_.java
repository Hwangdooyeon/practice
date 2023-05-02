import java.util.Scanner;

public class Baekjoon5585_ {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int s = sc.nextInt();
        int result = 1000 - s;
        int money[] = {500,100,50,10,5,1};
        int coin = 0;
        int cnt = 0;



            while (result!=0){
                coin += result / money[cnt];
                result = result % money[cnt];
                cnt++;

            }
        System.out.println(coin);
        }
    }

