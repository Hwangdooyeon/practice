import java.util.Scanner;

public class Dsolution1 {
    public static void main(String[] args){
        int[] arr = new int[11];
        System.out.println("0부터 100까지 숫자를 넣어주세요");
        Scanner number= new Scanner(System.in);


        for (int i=0; i<11; i++) {

            arr[i] = number.nextInt();
        }

            for (int i=0; i<arr.length; i++){
                if(arr[i] == 40|| arr[i]==50|| arr[i] ==60){
                    System.out.print(arr[i]+", ");
                }


        }
    }
}
