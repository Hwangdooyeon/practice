import java.util.Scanner;

public class Baekjoon2566 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr1 = new int[10][10];
        int max = 0;
        int i=0;
        int j=0;
        for (int x=0; x< 9; x++){
            for (int y=0; y<9; y++){

                arr1[x][y] = sc.nextInt();

                if (arr1[x][y]>max){

                    max = arr1[x][y];
                    i = x;
                    j = y;
                }
            }
        }
        System.out.println(max);
        System.out.println((i+1)+ " " +(j+1));
    }
}
