package problems;

//https://leetcode.com/problems/palindrome-number/
//Follow up: Could you solve it without converting the integer to a string?
public class PalindromeNumber {
	public static void main(String args[]) {
		int x = -1410110141;
		System.out.println(isPalindrome(x));
	}

	private static void divideNumberToArray(int x, int digitCount, int[] temp) {
		while (x > 0) {
			temp[digitCount - 1] = x % 10;
			x = (x - temp[digitCount - 1]) / 10;
			System.out.println(temp[digitCount - 1]);
			digitCount--;
		}
	}

	private static int countOfDigits(int x) {
		int digitCount = 1;
		int remaining;
		while ((x/10) >= 1) {
			remaining = x % 10;
			x = x - remaining;
			x = x / 10;
			digitCount++;
		}
		return digitCount;
	}

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int digitCount = countOfDigits(x);
		int[] temp = new int[digitCount];

		divideNumberToArray(x, digitCount, temp);

		int lastDigit = digitCount -1;
		int firstDigit = 0;
		while (firstDigit <= lastDigit && firstDigit < (digitCount) / 2) {
			if (temp[firstDigit] != temp[lastDigit]) {
				return false;
			}
			firstDigit++;
			lastDigit--;
		}
		return true;
	}
}
