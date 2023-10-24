import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1427 {
    final static Scanner sc = new Scanner(System.in);
    static int n;
    static boolean[] used;
    static void process(List<String> num, int depth){
        if (depth >= n){
            System.out.println(String.join(" ",num));
            return;
        }
        for (int i=1; i<=n; i++){
            if (!used[i]){
                num.add("" + i);
                used[i] = true;
                process(num, depth+1);
                used[i] = false;
                num.remove(num.size() -1);
            }
        }
    }
    public static void main(String[] args){
        n = sc.nextInt();
        used = new boolean[n+1];
        List<String> num = new ArrayList<>();

        process(num,0);
    }
}
