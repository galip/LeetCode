package problems.easy;

// https://leetcode.com/problems/missing-number/
public class MissingNumber {
	public static void main(String args[]) {

//		int[] nums = { 3, 0, 1 };
		
//		int[] nums = { 0, 1 };
		
		int[] nums = { 9,6,4,2,3,5,7,0,1 };

		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		int length = nums.length;

		int sumShouldBe = (length) * (length + 1) / 2;

		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += nums[i];
		}

		return sumShouldBe - sum;
	}

}
