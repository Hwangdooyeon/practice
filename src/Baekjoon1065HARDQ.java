import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon1065HARDQ {
    static final Scanner sc = new Scanner(System.in);

    public static ArrayList<Integer> getDigits(int num) {
        ArrayList<Integer> ret = new ArrayList<>();

        while (num / 10 > 0) {
            ret.add(num % 10);
            num = num / 10;
        }

        ret.add(num);
        Collections.reverse(ret);


        return ret;
    }
    public static void main(String[] args) {
        int N = sc.nextInt();
        int answer = 0;
        for (int i=1; i<=N; i++){


            ArrayList<Integer> digits = getDigits(i);
            boolean isOk = true;
            if (digits.size() >= 3){
                int difference = digits.get(1) - digits.get(0);
                for (int v=1; v<digits.size()-1; v++){

                    if (difference != digits.get(v+1) - digits.get(v)){

                        isOk = false;

                        break;
                     }
                    }
                }
            if (isOk){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
