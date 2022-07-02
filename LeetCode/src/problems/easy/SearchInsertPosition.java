package problems.easy;

// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
	public static void main(String args[]) {
//		int[] nums = { 1, 3, 5, 6 };
//		int target = 5;
		
//		int[] nums = { 1, 3, 5, 6 };
//		int target = 2;
		
		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		
		System.out.println(searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			if (target <= nums[i] && i != length) {
				return i;
			}
		}
		return length;
	}
}