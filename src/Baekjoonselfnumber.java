import java.util.ArrayList;
import java.util.Collections;

public class Baekjoonselfnumber {


    public static ArrayList<Integer> getDigits(int num) {
        ArrayList<Integer> ret = new ArrayList<>();
        while (num != 0) {
            ret.add(num % 10);
            num = num / 10;
        }
        ret.add(num);
        Collections.reverse(ret);

        return ret;
    }

    public static void main(String[] args) {
        int answer = 0;
        int N = 10001;
        for (int i = 1; i < N; i++) {


            ArrayList<Integer> digits = getDigits(i);
            boolean[] check = new boolean[10001];


                }

            }

        }
