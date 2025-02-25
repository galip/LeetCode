package problems.medium;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSumII {
	public static void main(String[] args) {

		// numbers = [2,7,11,15], target = 9

		int[] array = { 2, 7, 11, 15 };
		int target = 9;
		
		int[] result = twoSum(array, target);
		
		System.out.println(Arrays.toString(result));
	}

	public static int[] twoSum(int[] numbers, int target) {
		
		int firstIndex = 0;
		int lastIndex = numbers.length - 1;
		int[] result = new int[2];
		while(firstIndex < lastIndex) {
			
			if(numbers[firstIndex] + numbers[lastIndex] == target) {
				result[0] = firstIndex + 1;
				result[1] = lastIndex + 1;
				return result;
			} else if (numbers[firstIndex] + numbers[lastIndex] < target) {
				firstIndex++;
			} else {
				lastIndex--;
			}
		}
		return numbers;
	}
}
