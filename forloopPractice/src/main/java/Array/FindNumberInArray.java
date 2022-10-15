package Array;

public class FindNumberInArray {
	public static void main(String s[]) {
		int[] abcd = { 10, 20, 30, 40, 50, 60 };
		int findElement = 50;
		boolean ispresent = false;
		{
			for (int i = 0; i < abcd.length; i++)
				if (abcd[i] == findElement) {
					ispresent = true;
					break;
				}
			{
				if (ispresent) {
					System.out.println("The number is present");
				} else {
					System.out.println("The number is not present");
				}
			}
		}
	}
}
