package problems.easy;

// https://leetcode.com/problems/score-of-a-string/description
public class ScoreOfAString {
	public static void main(String args[]) {

		String s = "hello";
		int result = scoreOfString(s);
		System.out.println(result);
	}

	public static int scoreOfString(String s) {
		char[] c = s.toCharArray();

		int difference = 0;
		int sum = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			difference = Math.abs(c[i] - c[i + 1]);
			sum += difference;
		}
		return sum;
	}
}