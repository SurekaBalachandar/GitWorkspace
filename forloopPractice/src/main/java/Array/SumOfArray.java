package Array;

public class SumOfArray {
	public static void main(String s[]) {
		int[] numbers = { 20, 21, 22, 23, 24, 25, 26 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
			{
				System.out.println(sum);
			}
		}
	}
}
