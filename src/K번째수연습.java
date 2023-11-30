import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class K번째수연습 {

	public static void main(String[] args) {

		Solution2 s = new Solution2();
		int[] num = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { 
				{ 2, 5, 3 }, // commands[0][0],commands[0][1],commands[0][2]
				{ 4, 4, 1 }, // commands[1][0],commands[1][1],commands[1][2]
				{ 1, 7, 3 }// commands[2][0],commands[2][1],command[2][2]
		};
		int[] result = s.solution(num, commands);
		System.out.println(Arrays.toString(result));
	}
}

class Solution2 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		// 1. commands 배열에 있는 것을 하나씩 꺼내서 start, end, find를 print 해보기

		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0] - 1; // 2--> 인덱스 2-1 (1)
			int end = commands[i][1] - 1;
			int find = commands[i][2] - 1;
			System.out.println(start + " " + end + " " + find);

			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = start; j <= end; j++) {
				list.add(array[j]);
				
			
			}
			System.out.println(list);
			Collections.sort(list);
			answer[i] = list.get(find);
		}

		// 2. 인덱스 범위만큼 추출해서 모아두기 list
		// 모을 객체 필요 ==> ArrayList

		return answer;
	}
}