import java.util.Scanner;

public class Baekjoon9086 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int num = sc.nextInt();
        for (int i=0; i<num; i++){
            String name = sc.next();

            System.out.println(name.charAt(0) +""+ name.charAt(name.length()-1));
        }
    }
}
