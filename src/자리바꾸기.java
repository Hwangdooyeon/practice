import java.util.Arrays;

public class 자리바꾸기 {

	public static void main(String[] args) {
		int[] num = {6,1,2,3,5,9};
		System.out.println(Arrays.toString(num));
		
		int temp = num[1];
		num[1] = num[0];
		num[0] = temp;
		System.out.println(Arrays.toString(num));
	}

}
