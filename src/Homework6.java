import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String[] arr = {"Life", "is", "too", "short"};
        System.out.print("단어배열:");

        for (int i = 0; i < arr.length; i++) {


            arr[i] = text.nextLine();

            System.out.println(arr[i] + " ");
        }
    }
}
