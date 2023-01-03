import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> number = new ArrayList<>();
        int sum = 0;

        for (int i = i=0; i<10; i++){

            number.add(sc.nextInt());

            sum += number.size();

        }
        System.out.print(sum);
    }
}
