import java.util.Scanner;

import java.util.Scanner;

public class Baekjoon2798 {
    final static Scanner sc = new Scanner(System.in);
    private static int process(int[] arr, int N, int M){
        int cnt = 0;

        for (int i=0; i<N-2; i++){

            for (int j=i+1; j<N-1; j++){

                for (int k=j+1; k<N; k++){

                    int answer = arr[i] + arr[j] + arr[k];

                    if (M==answer){
                        return answer;
                    }

                    if (cnt < answer && answer < M){

                        cnt = answer;
                    }
                }

            }
        }
        return cnt;
    }
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();

        int [] arr = new int[N];

        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = process(arr, N , M);
        System.out.println(cnt);
    }
}