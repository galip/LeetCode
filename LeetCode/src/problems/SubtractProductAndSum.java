package problems;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/
public class SubtractProductAndSum {
	public static void main(String args[]) {

		int n = 4421;
		System.out.println(subtractProductAndSum(n));

	}

	private static void divideNumberToArray(int x, int digitCount, int[] temp) {
		while (x > 0) {
			temp[digitCount - 1] = x % 10;
			x = (x - temp[digitCount - 1]) / 10;
			digitCount--;
		}
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

	public static int subtractProductAndSum(int n) {
		int digitCount = countOfDigits(n);
		int[] arr = new int[digitCount];
		divideNumberToArray(n, countOfDigits(n), arr);

		int productsOfNum = 1;
		int sumOfNum = 0;
		for (int i = 0; i < digitCount; i++) {
			productsOfNum = productsOfNum * arr[i];
			sumOfNum += arr[i];
		}
		return productsOfNum - sumOfNum;
	}
}
