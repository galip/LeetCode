package problems.medium;

// https://leetcode.com/problems/count-and-say/
public class CountAndSay {
	public static void main(String args[]) {
		int n = 30;

		System.out.println(countAndSay(n));
	}

	public static String countAndSay(int n) {
		if (n == 1)
			return "1";

		StringBuilder sb = new StringBuilder();
		String num = "1";
		int counter = 0;
		int length = 0;
		for (int i = 2; i <= n; i++) {
			char[] c = num.toCharArray();
			counter = 1;
			length = c.length;
			for (int j = 0; j < length; j++) {
				if ((j + 1) < length && c[j] == c[j + 1]) {
					counter++;
				} else {
					sb.append(counter);
					sb.append(c[j]);
					counter = 1;
				}
			}
			num = sb.toString();
			sb = new StringBuilder();
		}
		return num;
	}
}