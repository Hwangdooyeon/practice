import java.util.*;

public class Baekjoon_1920 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            set.add(sc.nextInt());

            }

        int m = sc.nextInt();

        int [] arr = new int[m];

        for (int i=0; i<m; i++){

            arr[i] = sc.nextInt();
        }
        for (int i=0; i<m; i++){
            if (set.contains(arr[i])){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}

