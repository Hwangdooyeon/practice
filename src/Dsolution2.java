import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dsolution2 {
    public static void main(String[] args) {
        int arr[] = new int[11];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        for (int u=0; u<arr.length; u++){
            if (arr[u]==50){
                System.out.println(u);
            }
        }
    }
}


