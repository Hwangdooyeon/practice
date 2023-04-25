import java.util.Scanner;

public class Baekjoon25314 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            if (i%4==0){
                System.out.print("long"+" ");
            }
        }
        System.out.print("int");
    }
}
