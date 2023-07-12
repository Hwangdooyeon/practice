import java.util.Scanner;

public class Baekjoon2920 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int A[] = new int[8];
        int as = 0;
        int dc = 0;

        for (int i=0; i<8; i++){

            A[i] = sc.nextInt();

            if (i+1==A[i])
                as++;
            else if (8-i==A[i])
                dc++;

            }
        if (as==8)
            System.out.println("ascending");

        else if (dc==8)
            System.out.println("descending");


        else
            System.out.println("mixed");
        }
    }



