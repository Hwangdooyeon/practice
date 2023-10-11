import java.util.Scanner;

public class landsnail {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int flug1 = 1;
        int flug2 = -1;
        int value = 1;
        int row = 0;
        int col = -1;

        int[][] number = new int[n][n];

        while (value < n*n) {

            for (int i =0 ; i < n; i++) {
                col += flug1;
                number[row][col] = value;
                value += 1;
            }
            n--;
                for (int i=0; i<n; i++){
                    row += flug1;
                    number[row][col] = value;
                    value += 1;

                    if (n==0){
                        break;
                    }
                }
                flug1 = flug1 * -1;
            }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(number[row][col] + " ");
            }
            System.out.println();
        }
        }
    }
