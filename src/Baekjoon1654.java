import java.util.Scanner;

public class Baekjoon1654 {

    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
          int k = sc.nextInt();
          long n = sc.nextLong();
          long arr[] = new long[k];
          long max = 0;

          for (int i=0; i<k; i++) {

              arr[i] = sc.nextLong();
              max = Math.max(max,arr[i]);
          }
          long left = 1;
          long right = max;

          while (left <= right){

              long mid = (left+right)/2;
              long sum = 0;
              for (int i=0; i<k; i++){

                  sum += arr[i]/mid;
              }
              if (n<=sum) {
                  left = mid + 1;

              }
              else {

                  right = mid - 1;

              }
          }
          System.out.println(right);
    }
}
//4 11
//802
//743
//457
//539