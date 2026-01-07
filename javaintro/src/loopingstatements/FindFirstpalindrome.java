package loopingstatements;

public class FindFirstpalindrome {

	public static void main(String[] args) {

		int n = 100;
		int count = 0;
		while (count < 5 && n <= 200) {
			if (isPalindrome(n)) {
				count++;
				System.out.print(n+" ");
			}
			n++;
		}

	}

	private static boolean isPalindrome(int n) {
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		return sum == temp;
	}
}
