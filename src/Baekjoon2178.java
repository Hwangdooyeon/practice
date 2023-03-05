import java.time.Year;
import java.util.Scanner;

public class Baekjoon2178 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] miro = new int[N][M];
        int miro1= 1;

        for (int i=0; i<miro.length; i++){
            for (int j=0; j<miro[i].length; j++){
                miro[i][j] = miro1;

            }
        }
        for (int i=0; i<miro.length; i++){
            for (int j=0; j<miro[i].length; j++){
                System.out.print(miro[i][j]);
            }
            System.out.println();
        }
    }
}
