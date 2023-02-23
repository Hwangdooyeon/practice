import java.util.Scanner;

public class Baekjoon1546_ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int max = -100000;
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<arr.length; i++){

            arr[i] = sc.nextInt();

            if(arr[i] > max) {

                max = arr[i];
            }
        }
        for (int u=0; u<arr.length; u++){

            total = ((double) arr[u])/max*100 + total;

        }
        double result = total / arr.length;
        System.out.println(result);
    }
}
