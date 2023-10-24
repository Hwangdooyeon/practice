import java.util.Scanner;

public class Baekjoon1157 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        String s = sc.nextLine().toUpperCase();
        int[] count = new int[26];

        int max = 0;
        char maxchar = '?';

        for (int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'A';
            ++count[idx];

            if (max < count[idx]){
                max = count[idx];
                maxchar = s.charAt(i);


            }
            else if (max == count[idx]){
                maxchar = '?';
            }
        }
        System.out.println(maxchar);
    }
}
