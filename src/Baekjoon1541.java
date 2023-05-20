import java.util.Scanner;

public class Baekjoon1541 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int sum = Integer.MAX_VALUE;
        String[] number = sc.nextLine().split("-");


        for (int i=0; i<number.length; i++){

            int temp = 0;


            String[] Allnumber = number[i].split("\\+");

            for (int j=0; j<Allnumber.length; j++){

                temp += Integer.parseInt(Allnumber[j]);

            }

            if (sum == Integer.MAX_VALUE){
                sum = temp;

            }
            else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }

}
