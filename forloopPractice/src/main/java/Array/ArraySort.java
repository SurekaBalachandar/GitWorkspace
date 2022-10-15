package Array;

public class ArraySort {
	public static void main(String[] args) {
		int array[] = { 2, 6, 0, 7, 1, 5 };
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.print(array[i]);
		}
	}
}
