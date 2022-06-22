package problems;

// https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
public class OneStringSwap {
	public static void main(String args[]) {

		String s1 = "a";
		String s2 = "s";

		System.out.println(areAlmostEqual(s1, s2));
	}

	public static boolean areAlmostEqual(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		if(ch1.length == 1 && ch1[0] != ch2[0]) {
			return false;
		}

		int counter = 0;
		char[] controlChar = new char[2];
		char[] controlChar2 = new char[2];
		int missedIndex = 0;

		int length = s1.length();
		for (int i = 0; i < length; i++) {
			if (ch1[i] != ch2[i]) {
				counter++;
				if (counter > 2) {
					return false;
				}
				controlChar[missedIndex] = ch1[i];
				controlChar2[missedIndex] = ch2[i];
				missedIndex++;
			}
		}
		if (length > 1 && (controlChar[0] != controlChar2[1] || controlChar[1] != controlChar2[0])) {
			return false;
		}
		return true;
	}
}