import java.util.Scanner;

public class Baekjoon5555 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String s = sc.next();
        int cnt = 0;
        int n = sc.nextInt();

        for (int i=0; i<n; i++){

            String t = sc.next();

            t += t;
            if (t.contains(s))
                cnt++;
            }
        System.out.println(cnt);
        }
    }

