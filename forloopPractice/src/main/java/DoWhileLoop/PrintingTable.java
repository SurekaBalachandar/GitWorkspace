package DoWhileLoop;

public class PrintingTable {
	public static void main(String s[]) {
		int i = 1;
		int t = 5;
		do {
			System.out.println(i + " * " + t + " = " + (i * t));
			i++;
		} while (i <= 10);
	}
}
