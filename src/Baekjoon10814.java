import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baekjoon10814 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int  n = sc.nextInt();
        String [][] age = new String[n][2];

        for (int i=0; i<n; i++){

            age[i][0] = sc.next();
            age[i][1] = sc.next();

        }
        Arrays.sort(age, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        for (int i=0; i<n; i++){
            System.out.println(age[i][0] + " " +age[i][1]);
        }
    }
}
