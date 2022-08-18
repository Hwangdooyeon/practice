import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("수:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }


        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                }
            }
                for (int sort:array){
                    System.out.print(sort+ ",");
                }
            }
    }



