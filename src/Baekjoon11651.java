import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baekjoon11651 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        int [][] arr = new int[n][2];

        for (int i=0; i<n; i++) {
            for (int j = 0; j < 2; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
                Arrays.sort(arr, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        if (o1[1] == o2[1]){
                            return o1[0] - o2[0];
                        }
                        else
                            return o1[1] - o2[1];
                    }
                });


        for (int i=0; i<n; i++){
            for (int j=0; j<2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
