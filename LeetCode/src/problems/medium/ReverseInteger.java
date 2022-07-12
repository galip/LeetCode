package problems.medium;

// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
	public static void main(String args[]) {
//		int x = 123;

//		int x = 123;
		
//		int x = 1534236469;
		
		int x = -2147483648;
				
		System.out.println(reverse(x));
	}

	public static int reverse(int x) {
		int remainder = 0;
		long reverse = 0;
		long multiplier = 1;
		int digitCount = countOfDigits(x);
		while (x != 0) {
			remainder = x % 10;
			x = x - remainder;
			x = x / 10;
			multiplier = power(10, (digitCount - 1));
			reverse += remainder * multiplier;
			digitCount--;
		}
		if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
			return 0;
		return (int) reverse;
	}

	private static int power(int number, int power) {
		if (power == 0)
			return 1;
		if (power >= 1)
			return number * power(number, (power - 1));
		return 0;
	}

	private static int countOfDigits(long x) {
		int digitCount = 1;
		long remaining;
		if (x < 0)
			x = x * (-1);
		while ((x / 10) >= 1) {
			remaining = x % 10;
			x = x - remaining;
			x = x / 10;
			digitCount++;
		}
		return digitCount;
	}
}