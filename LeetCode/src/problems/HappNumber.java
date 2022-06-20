package problems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/happy-number/
public class HappNumber {
	public static void main(String args[]) {

		//int n = 19; // true
		//int n = 2; // false
		int n = 1;

		System.out.println(isHappy(n));
	}

	public static boolean isHappy(int n) {
		if(n == 1)
			return true;
		int tmp = n;
		int result = 1;
		List<Integer> controlList = new ArrayList<>();
		while (result != n) {
			int digitCount = countOfDigits(tmp);
			int[] temp = new int[digitCount];
			divideNumberToArray(tmp, digitCount, temp);
				result = 0;
				for (int j = 0; j < digitCount; j++) {
					result += temp[j] * temp[j];
				}

				if(controlList.contains(result)) {
					return false;
				}
				controlList.add(result);
				if (result == n)
					return false;

				if (result == 1)
					return true;
				
				tmp = result;
		}
		return false;
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

	private static void divideNumberToArray(int x, int digitCount, int[] temp) {
		while (x > 0) {
			temp[digitCount - 1] = x % 10;
			x = (x - temp[digitCount - 1]) / 10;
			System.out.println(temp[digitCount - 1]);
			digitCount--;
		}
	}

}
