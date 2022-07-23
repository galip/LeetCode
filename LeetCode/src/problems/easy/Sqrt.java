package problems.easy;

// https://leetcode.com/problems/sqrtx/
public class Sqrt {
	public static void main(String args[]) {
		int x = 2147395599; // 46339

		System.out.println(mySqrt(x));
	}

	public static int mySqrt(int x) {
		if (x == 1)
			return 1;

		if (x == 0)
			return 0;

		int left = 0;
		int right = x / 2;
		long middle = ((left + right) / 2);

		if (right == 1)
			return 1;

		while (left <= middle) {
			int tmpMiddle = ((left + right) / 2);
			if ((middle * middle) < x && (middle + 1) * (middle + 1) >= x) {
				if ((middle + 1) * (middle + 1) == x) {
					return (int) (middle + 1);
				}
				return (int) middle;
			}
			if ((middle * middle) > x) {
				right = (int) middle;
				middle = (left + right) / 2;
			} else if ((middle * middle) < x) {
				left = (int) middle;
				middle = (left + right) / 2;
			}
			middle = ((left + right) / 2);
			if (tmpMiddle == middle)
				middle = middle + 1;
		}
		return 0;
	}
}