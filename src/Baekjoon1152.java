import java.util.Scanner;

public class Baekjoon1152 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String C = sc.nextLine();
        String array[] = C.split(" ");
        int cnt = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("")){
                continue;
            }else {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}