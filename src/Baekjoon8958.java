import java.util.Scanner;

public class Baekjoon8958{

    final static Scanner sc =new Scanner(System.in);
    public static void main(String[] args){

        int n = sc.nextInt();
        int[] result = new int[n];

        sc.nextLine();

        for (int i=0; i<n; i++){
            String s = sc.nextLine();
            int cnt = 0;

            for (int j=0; j<s.length(); j++){

                if (s.charAt(j)=='O'){

                    cnt++;

                    result[i] += cnt;
                }
                else {
                    cnt = 0;
                }
            }
        }
        for (int i=0; i<n; i++){
            System.out.println(result[i]);
        }
    }
}



