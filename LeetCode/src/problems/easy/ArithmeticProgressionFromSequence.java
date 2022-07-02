package problems.easy;

import java.util.Arrays;

// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
public class ArithmeticProgressionFromSequence {
	public static void main(String args[]) {

		int[] arr = { 2, 10, 7, 8, 3 };
//		int[] arr = { 1,2,4 };

		System.out.println(canMakeArithmeticProgression(arr));
	}

	public static boolean canMakeArithmeticProgression(int[] arr) {
		Arrays.sort(arr);
		int diff = 0;
		int tmp = arr[1] - arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			diff = arr[i + 1] - arr[i];
			if (diff != tmp) {
				return false;
			}
		}
		return true;
	}

}
