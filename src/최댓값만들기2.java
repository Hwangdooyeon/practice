

import java.util.ArrayList;
import java.util.Arrays;



public class 최댓값만들기2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		//0, 31, 24, 10, 1, 9
		int[] numbers = {1, 2, -3, 4, -5};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(int[] numbers) {
		int answer = 0;
		Arrays.sort(numbers);
		int last = numbers[0] * numbers[1];
		int last2 = numbers[numbers.length-1] * numbers[numbers.length-2];
		
		if (last > last2) {
			answer = last;
		}
		else {
			answer = last2;
		}
		
		return answer;
	}
}