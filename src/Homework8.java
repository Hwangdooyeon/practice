import java.util.*;
import java.util.List;

public class Homework8 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,1,1,2,2,3,3,3,4,4,5);

        HashSet<Integer> set = new HashSet<>();
        set.addAll(num);
        System.out.println(set);
    }
}
