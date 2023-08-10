import java.util.HashSet;
import java.util.Scanner;

public class Baekjoon4158 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        while (true){

            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n==0&&m==0){
                break;
            }

            HashSet<Integer> set = new HashSet<>();
            int cnt = 0;

            for (int i=0; i<n; i++){

                set.add(sc.nextInt());
            }
            for (int j=0; j<m; j++) {

                int two = sc.nextInt();

                if (set.contains(two)){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
