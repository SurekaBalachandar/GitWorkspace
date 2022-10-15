package forloopPractice;

public class matrixStarPrinting {
	public static void main(String s[]) {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			System.out.print("*");

			for (int j = 1; j < n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");

		}
	}

}
