import java.util.Scanner;

public class landsnail2 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        int value = 1;
        int row = 0;
        int column = -1;
        int flug = 1;
        int count = n;

        for (int i=0; i<n; i++){
            for (int j=0; j<count; j++){

                column+=flug;
                arr[row][column] = value;
                value++;
            }
            count--;
            for (int k=0; k<count; k++){

                row += flug;
                arr[row][column] = value;
                value++;
            }
            flug = flug *-1;
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
