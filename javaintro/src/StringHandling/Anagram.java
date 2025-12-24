package StringHandling;

public class Anagram {

	public static void main(String[] args) {
		String s = "listen";
		String s1 = "silent";
		int[] s2 = new int[s.length()];
		int[] s3 = new int[s.length()];
		char[] c = s.toCharArray();
		char[] c1 = s1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			s2[i] = (int) c[i];
		}
		for (int i = 0; i < c1.length; i++) {
			s3[i] = (int) c1[i];
		}
		int temp = 0;
		for (int r = 0; r < s2.length; r++) {
			for (int j = 0; j < s2.length - r - 1; j++) {
				if (s2[j] > s2[j + 1]) {
					temp = s2[j];
					s2[j] = s2[j + 1];
					s2[j + 1] = temp;
				}

			}

		}
		for (int r = 0; r < s3.length; r++) {
			for (int j = 0; j < s3.length - r - 1; j++) {
				if (s3[j] > s3[j + 1]) {
					temp = s3[j];
					s3[j] = s3[j + 1];
					s3[j + 1] = temp;
				}

			}

		}
		for (int a : s2) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int a : s3) {
			System.out.print(a + " ");
		}
	}

}
