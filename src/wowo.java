import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;




public class wowo {
    static final Scanner scanner = new Scanner(System.in);

    public static ArrayList<Integer> getDigits(int num){
        ArrayList<Integer> ret = new ArrayList<>();

        while(num / 10 > 0){
            ret.add(num % 10);
            num = num / 10;
        }
        ret.add(num);
        Collections.reverse(ret);

        return ret;
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int answer = 0;
        for(int u=1; u<=N; u++){

            ArrayList<Integer> digits = getDigits(u);
            boolean isOk = true;
            if(digits.size() >= 3){
                int difference = digits.get(1) - digits.get(0);
                for(int v=1; v<digits.size()-1; v++){

                    if(difference != digits.get(v+1) - digits.get(v)){
                        isOk = false;
                        break;
                    }
                }
            }
            if(isOk){
                answer++;
            }
        }
        System.out.println(answer);
    }
}