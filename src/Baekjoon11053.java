import java.util.HashSet;
import java.util.Scanner;

public class Baekjoon11053 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] dt = new int[n];

        for (int i=0; i<n; i++){

            arr[i] = sc.nextInt();
            dt[i] = 1;
        }
        for (int i=0; i<n; i++){
            for(int j= i; j<n; j++){
                  if (arr[i] < arr[j]){
                      dt[j] = Math.max(dt[j], dt[i] +1);

                      System.out.println("i: " + i + ", j: " + j + ", dt[i]: " + dt[i] + ", dj[j]: " + dt[j]);
                  }
            }
        }
        int max = 0;
        for (int i=0; i<n; i++){
            if (max < dt[i])
                max = dt[i];

            }
            System.out.println(max);
        }
    }

