package problems.medium;

// https://leetcode.com/problems/wiggle-subsequence/
public class LongestWiggleSubsequence {
	public static void main(String args[]) {
//		int[] nums = {1,7,4,9,2,5};
//		int[] nums = {1,2,3,4,5,6,7,8,9};
		int[] nums = {1,17,5,10,13,15,10,5,16,8};
		
		System.out.println(wiggleMaxLength(nums));
	}

	public static int wiggleMaxLength(int[] nums) {
		int length = nums.length;
		int positive = 1;
		int negative = 1;
		for(int i = 0; i < length-1; i++) {
			if(nums[i+1] > nums[i]) {
				positive = negative + 1;
			} else if(nums[i+1] < nums[i]){
				negative = positive + 1;
			}
		}
		return positive > negative ? positive : negative;
	}
}