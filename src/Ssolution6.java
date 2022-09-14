import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ssolution6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<11; i++){

            int number = sc.nextInt();
            list.add(number);

            System.out.println("숫자를 입력해주세요");
        }
          int index1 = sc.nextInt();
          int index2=  sc.nextInt();

          int temp = list.get(index1);
          list.set(index1,list.get(index2));
          list.set(index2, temp);

          for (int i=0; i<11; i++){
              System.out.println(list.get(i)+" ,");
          }

    }
}
