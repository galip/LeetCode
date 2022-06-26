package problems;

// https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {
	public static void main(String args[]) {
		int[] nums = { 0, 1, 0, 3, 12 };
//		int[] nums = {0,0,1};

		moveZeroes(nums);
		for(int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
	}

	public static void moveZeroes(int[] nums) {
		int length = nums.length;
		int counter = 0;
		int[] result = new int[length];
		for (int i = 0; i < length; i++) {
			if (nums[i] != 0) {
				result[counter] = nums[i];
				counter++;
			}
		}
		for(int i = 0; i < length; i ++)
			nums[i] = result[i];
	}
}