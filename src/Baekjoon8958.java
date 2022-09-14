import java.util.Scanner;

public class Baekjoon8958{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {

            int cnt = 0;
            int sum = 0;

            String s = sc.next();

            for(int j=0; j<s.length(); j++) {

                if (s.charAt(j) == 'o') {
                    cnt++;
                    sum += cnt;
                }

                else {
                    cnt = 0;
                }
            }

            System.out.println(sum);
        }
    }
}
