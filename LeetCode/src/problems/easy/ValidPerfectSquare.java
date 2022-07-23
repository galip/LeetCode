package problems.easy;

// https://leetcode.com/problems/valid-perfect-square/
public class ValidPerfectSquare {
	public static void main(String args[]) {
		int num = 16;

		System.out.println(isPerfectSquare(num));
	}

	public static boolean isPerfectSquare(int num) {
		int left = 0;
		int right = num / 2;
		long middle = (left + right) / 2;

		if (num == 1)
			return true;

		long result = 0;
		int tmpMiddle = 0;
		while (left < middle) {
			tmpMiddle = ((left + right) / 2);
			result = middle * middle;
			if (result == num) {
				return true;
			} else if (result > num) {
				right = (int) middle;
				middle = (left + middle) / 2;
			} else {
				left = (int) middle;
				middle = (left + right) / 2;
			}
			if (tmpMiddle == middle) {
				if ((middle + 1) * (middle + 1) == num) {
					return true;
				}
			}
		}
		return false;
	}
}