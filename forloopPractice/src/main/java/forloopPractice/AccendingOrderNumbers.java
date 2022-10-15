package forloopPractice;

public class AccendingOrderNumbers {
	public static void main(String[] args) {
		int[] numbers = { 4, 6, 12, 1, 3, 0, 5 };
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = temp;
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers[i]; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}

				System.out.println("accending order is" + numbers[j]);
			}
		}
	}
}
