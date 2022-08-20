package problems.easy;

import java.util.HashMap;

public class SingleNumber {
	public static void main(String args[]) {

//		int[] nums = { 4, 1, 2, 1, 2 };
		
//		int[] nums = { 2, 2, 1 };
		
		int[] nums = { 1 };
		
		System.out.println(singleNumber(nums));	
	}

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Boolean> map = new HashMap<>();

		int length = nums.length;
		for (int i = 0; i < length; i++) {
			if (map.get(nums[i]) == null) {
				for (int j = i+1; j < length; j++) {
					if (nums[i] == nums[j]) {
						map.put(nums[i], true);
						break;
					}
				}
				if (map.get(nums[i]) == null)
					return nums[i];
			}
		}
		return -1;
	}
}