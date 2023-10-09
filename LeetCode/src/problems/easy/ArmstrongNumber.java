package problems.easy;

// gives armstrong value, warmup practise.
public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 371;

		int digit = 0;
		int armstrongValue = 0;
		while (number != 0) {
			digit = number % 10;
			number = number - digit;
			number = number / 10;

			armstrongValue = armstrongValue + power(digit, 3);
		}

		System.out.println(armstrongValue);
		
		if(armstrongValue == digit) {
			System.out.println("Yes, armstrong.");
		} else {
			System.out.println("Not an armstrong value.");
		}
//		System.out.println(countOfDigits(armstrongValue));

	}

	public static int power(int number, int power) {
		int result = 1;
		for (int i = 1; i <= power; i++)
			result = result * number;
		return result;
	}

	private static int countOfDigits(int x) {
		int digitCount = 1;
		int remaining;
		while ((x / 10) >= 1) {
			remaining = x % 10;
			x = x - remaining;
			x = x / 10;
			digitCount++;
		}
		return digitCount;
	}
}