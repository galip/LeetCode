package problems.medium;

// https://leetcode.com/problems/powx-n/
public class Pow {
	public static void main(String args[]) {
//		double x = 2.10000;
//		int n = 3;

//		double x = 0.00001;
//		int n = 2147483647;

//		double x = 1.00000;
//		int n = 2147483647;

//		double x = 2.00000;
//		int n = -2147483648;

		double x = -1.00000;
		int n = 2147483646;

		System.out.println(myPow(x, n));
	}

	public static double myPow(double x, int n) {
		if (x == 0 || x == 1)
			return x;
		if (n == 0)
			return 1;
		if (x == -1) {
			if (n % 2 == 0) {
				return 1;
			} else {
				return -1;
			}
		}

		if (n > Integer.MAX_VALUE || n <= Integer.MIN_VALUE)
			return 0;

		double result = 1.00000;
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				result = (double) (result * x);
			}
		} else {
			for (int i = 0; i < -n; i++) {
				result = (double) (result / x);
			}
		}
		return result;
	}
}