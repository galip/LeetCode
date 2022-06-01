package problems;

import java.util.Arrays;

//Runtime: 63 ms, faster than 33.10% of Java online submissions for Two Sum.
//Memory Usage: 42 MB, less than 99.52% of Java online submissions for Two Sum.
// https://leetcode.com/problems/two-sum/
public class TwoSum {
	public static void main(String args[]) {
		int[] nums = new int[]{ 2,7,11,15 };
		
		int[] result = twoSum(nums, 9);
		
		System.out.println(Arrays.toString(result));
	}

	public static int[] twoSum(int[] nums, int target) {
		int length = nums.length;
		int[] result = new int[2];
		
		for(int i = 0; i < length-1; i++) {
			for(int j = i+1; j < length; j++) {
				if(target == nums[i] + nums[j]) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}
}