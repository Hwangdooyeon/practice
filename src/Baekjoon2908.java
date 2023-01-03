import java.util.Scanner;

public class Baekjoon2908 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String reverseA = "";
        String reverseB = "";

        for (int i = A.length()-1; i>=0; i--){
            reverseA += A.charAt(i);
        }
        for (int i = B.length()-1; i>=0; i--){
            reverseB += B.charAt(i);
        }
        if(Integer.parseInt(reverseA) > Integer.parseInt(reverseB)){
            System.out.println(reverseA);
        }else{
            System.out.println(reverseB);
        }
    }
}
















//import java.util.Scanner;
//
//public class Baekjoon2908 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        String A = sc.next();
//        String B = sc.next();
//
//        String reverse ="";
//        for (int i=A.length()-1; i>=0; i--){
//            reverse = reverse + A.charAt(i);
//
//          int number = Integer.parseInt(A);
//            int number2 = Integer.parseInt(B);
//        }
//        while (A)
//
//        System.out.println(reverse);
//    }
//}
