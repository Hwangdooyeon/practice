import java.util.Scanner;

public class Baekjoon1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C = sc.next();
        int cntnumber = 0;
        int cnt = 0;

        for (int i = 0; i < C.length(); i++) {
            if (C != null && C.charAt(0) != ' ') {
                if (C.charAt(i)==' '){
                    cnt++;
                }
            }
        }
    }
}
