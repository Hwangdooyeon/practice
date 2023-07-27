import java.util.Scanner;

public class Baekjoon1264 {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String s;
        int cnt = 0;
        while (true) {
            s = sc.nextLine().toLowerCase();
            if (s.equals("#")) {
                break;
            }
            String length[] = s.split("");
            for (int i = 0; i < length.length; i++) {

                if (length[i].equals("a") || length[i].equals("e") || length[i].equals("i") || length[i].equals("u") || length[i].equals("o")) {
                    cnt++;
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }
}


