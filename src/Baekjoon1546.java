import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오");
        int n = sc.nextInt(); // 점수를 저장할 과목 수
        double arr[] = new double[n];// 과목의 수로 크기로 배열을 생성한다. 소수점이 필요함으로 double Api를 사용
        double sum = 0; // double sum 의 값을 0으로 초기화

        for(int i=0; i<arr.length; i++) { // 배열의 길이에서 1씩 더하는 값을 스캐너로 출력
            arr[i] = sc.nextDouble();   // ''
        }
        Arrays.sort(arr); // arr(과목의 수의 크기)배열을 오름차순으로 출력을 하게 해준다.

        for (int i=0;i<arr.length;i++ ){ // for 문을 한번 더 사용하지 않으면 위에있는 for 문을 계속 실행하면서 값을 출력하여 for 문을 한번 더 사용해 주어여함

            arr[i] = arr[i]/arr[arr.length-1]*100;// 문제에서 점수/M*100 을 정의한것

            sum += arr[i];
        }
        System.out.println(sum/arr.length);

    }
}