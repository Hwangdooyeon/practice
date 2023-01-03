import java.util.*;

public class Baekjoon3052 {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        List<Integer> number = new ArrayList<>();
        Set<Integer> answer = new HashSet<>();

        for (int i = 0; i < 10; i++) {

            number.add(su.nextInt());
        }
        for (int i = 0; i < 10; i++) {

          answer.add(number.get(i)%42);


        }
        System.out.println(answer.size());
    }
}
