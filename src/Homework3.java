import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호:");
        String s = sc.nextLine();

        String number = "990624-1068234";
       String yyyyMMdd = number.substring(0, 6);
       String num = number.substring(7);
       System.out.println("생년월일:" + " " + yyyyMMdd);
       System.out.println("뒷자리:"+ " " + num);
    }
}

