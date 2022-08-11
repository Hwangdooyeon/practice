import java.util.ArrayList;
import java.util.Arrays;

public class Dsolution8 {
    public static void main(String[] args){
        ArrayList<String> resverse = new ArrayList<>(Arrays.asList("Hello"));
        String str = "}Hello{";

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);

        }
        System.out.println(reverse);
    }
}
