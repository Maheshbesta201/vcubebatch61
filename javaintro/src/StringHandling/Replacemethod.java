package StringHandling;

public class Replacemethod {

	public static void main(String[] args) {
		String s = "am2 I1 to4 going3 this6 weekend7 hometown5";
		String[] arr = s.split(" ");
		int n = 1;
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].contains(n + "")) {
					result += arr[j].replace(n + "", " ");
					n++;
					break;
				}
			}
		}
		System.out.print(result + " ");
	}
}
