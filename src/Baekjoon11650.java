import java.util.*;

public class Baekjoon11650 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        int [][] arr = new int[n][2];

        for (int i=0; i<n; i++){
            for (int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] oi, int[] oj) {
                if (oi[0]==oj[0]){
                    return oi[1]-oj[1];
                }
                else {
                    return oi[0] - oj[0];

                }
            }
        });
        for (int i=0; i<n; i++){
            for (int j=0; j<2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
