import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 배열결과리스트에넣기 {
	final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		
		int[] n = {100,200,300,400,500};
		int cnt = 0;
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
			
			if (n[i] >= 300) {
				cnt++;
				list.add(i);
			}
			
		}
		System.out.println(cnt);
		System.out.println(list);
		
		for (int index : list) {
			
			n[index] = n[index] - 100;
		}

		Print.arr(n);
	}
}
