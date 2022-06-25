package problems;

// https://leetcode.com/problems/number-of-1-bits/
public class NumberOf1Bits {
	public static void main(String args[]) {
		int n = -3;
		System.out.println(hammingWeight(n));
	}

	public static int hammingWeight(int n) {
		String binaryString = Integer.toBinaryString(n);

		char[] binaryChars = binaryString.toCharArray();

		int length = binaryChars.length;
		int counter = 0;
		for (int i = 0; i < length; i++) {
			if (binaryChars[i] == '1') {
				counter++;
			}
		}
		return counter;
	}
}