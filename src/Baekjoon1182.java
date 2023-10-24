import java.lang.reflect.Array;
import java.util.*;

public class Baekjoon1182 {
    final static Scanner sc = new Scanner(System.in);
    static int cnt = 0;
    static int arr[];
    static int n,m;
    private static void process(int depth, int sum,boolean isSelected){
        if (depth>=n) {
            if (isSelected) {
                cnt = (sum == m) ? cnt + 1 : cnt;
            }
            return;
        }
            process(depth+1 ,sum+arr[depth],true);
            process(depth+1 ,sum,isSelected);

    }

    public static void main(String args[]) {

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i=0; i<n; i++){

            arr[i] = sc.nextInt();
        }
        process(0, 0,false);

        System.out.println(cnt);
    }
}