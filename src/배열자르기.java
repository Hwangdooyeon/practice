public class 배열자르기 {
    class Solution12 {
        public int[] solution(int[] numbers, int num1, int num2) {
            //int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
            //시작, 끝을 지정하는 함수는 끝 + 1주어야 한다.
            int[] answer = new int[num2-num1+1]; //3-1+1
            //자바는 "타입명 변수명" 을 썼을 때 메모리에 공간을 할당
            int index = 0;
            for (int i = num1; i <num2+1; i++) {
                answer[index] = numbers[i];
                index++;

            }
            return answer;

        }
    }
}
