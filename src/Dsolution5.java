import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dsolution5 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<11; i++){

            int su = num.nextInt();
            list.add(su);
        }
        System.out.println("입력해 주세요");
        int index1=num.nextInt();
        int number = 1000;

        int temp = list.get(index1);
        list.set(index1,number);


        for (int i=0; i<11; i++){
            System.out.print(list.get(i)+", ");
        }


    }
}