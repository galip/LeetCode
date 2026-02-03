package problems.easy;

import java.util.HashMap;

//https://leetcode.com/problems/majority-element/
public class MajorityElement {

	public static void main(String args[]) {
		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		int result = majorityElement(nums);
		System.out.println(result);
	}

	public static int majorityElement(int[] nums) {
		int count = 0;
		int length = nums.length;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < length; i++) {

			count = map.getOrDefault(nums[i], 0);
			map.put(nums[i], ++count);

			if (count > length / 2) {
				return nums[i];
			}
		}
		return -1;
	}
}
