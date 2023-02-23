import java.lang.reflect.Array;
import java.util.*;

public class Baekjoon1182 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int count = 0;
        int sum = 0;
        int arr[] = new int[N];

        for (int i=0; i<N; i++){

            arr[i] = sc.nextInt();

            Arrays.sort(arr);

        }
        for (int u=0; u<arr.length; u++){

            sum += arr[u];

            sum = sum;

            }
        if (sum==S){
            count++;
            }
        System.out.println(count);
        }
    }


