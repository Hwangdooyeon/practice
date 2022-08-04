import java.util.Arrays;
import java.util.Scanner;

public class Dsolution7 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요");

        int array[] = {0,10,20,30,40,50,60,70,80,90,100};

        int max = 0;
        int min = 0;

        for (int i=0; i<array.length; i++){
            array[i] =num.nextInt();

            if(max<array[i]){
                max = array[i];

            }

            if(min>array[i]) {
                min = array[i];
            }


        }
        System.out.println(min);
        System.out.println(max);


    }


}


