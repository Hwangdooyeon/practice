import java.util.Scanner;

public class Dsolution3 {
    public static void main(String[] args) {
        int[] arr = new int[11];
        System.out.println("0부터 100까지 숫자를 넣어주세요");
        Scanner number = new Scanner(System.in);
        int sum = 0;
        int average = 0;

        for (int i = 0; i < 11; i++) {

            arr[i] = number.nextInt();

            }
            for (int i=0; i<arr.length; i++)
            sum +=arr[i];
            average=sum /(arr.length);
            System.out.println(sum);
            System.out.println(average);

        }

    }

