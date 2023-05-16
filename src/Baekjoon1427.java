import java.util.*;

public class Baekjoon1427 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder();
        char[] arr = sc.nextLine().toCharArray();

        Arrays.sort(arr);

        for (int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);

        }
        System.out.println(sb);
    }
}

