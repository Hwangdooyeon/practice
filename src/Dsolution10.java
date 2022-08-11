import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dsolution10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] =  new int[n][n];

        for(int y=0; y<n; y++){
            arr[y][0] = 1;
        }

        for(int x=0; x<n; x++){
            arr[0][x] = 1;
        }

        for(int y=1; y<n; y++){
            for(int x=1; x<n; x++){
                arr[y][x] = arr[y-1][x] + arr[y][x-1];
            }
        }


        for(int y=0; y<n; y++){
            for(int x=0; x<n; x++){
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }
}