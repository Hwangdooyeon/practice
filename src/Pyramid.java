import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();

        for (int i=0; i<star; i++){

            for(int w=0; w <-1*i + star-1; w++){
                System.out.print(" ");
            }

            for (int w=0; w < 2*i+1; w++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
