package forloopPractice;

public class TrianglePrintValues {

	public static void main(String[] args) {
		int k = 4;
		int counter = 1;
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(counter);
				counter++;
			}
			System.out.println();
		}

	}

}
