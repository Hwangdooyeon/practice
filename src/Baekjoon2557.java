import java.util.Scanner;

public class Baekjoon2557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        if(num1==num2 && num2==num3 && num1==num3) {
            System.out.println(10000+num1*1000);
        }
         else if (num1==num2 || num1==num3){

            System.out.println(1000+num1*100);
        }
         else if(num2==num3){
             System.out.println(1000+num2*100);
        }

         else{
             int max =0;
             max = Math.max(num1,Math.max(num2,num3))*100;
             System.out.println(max);
        }
    }
}




