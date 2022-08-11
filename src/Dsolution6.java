import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dsolution6 {
    public static void  main(String[] args) {
        Scanner doo = new Scanner(System.in);
        System.out.println("0~100");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            int su = doo.nextInt();
            list.add(su);
        }

        System.out.println("please");
        int index1 = doo.nextInt();
        int index2 = doo.nextInt();

        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

        for (int i=0; i<11; i++){
            System.out.print(list.get(i)+ ", " );



        }



    }
}
