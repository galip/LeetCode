package problems;

import java.util.Arrays;

//https://leetcode.com/problems/largest-perimeter-triangle/
public class LargestPerimeterTriangle {
	public static void main(String args[]) {
		int[] arr = { 3,2,3,4 };
		System.out.println(largestPerimeter(arr));
	}

	public static int largestPerimeter(int[] nums) {
		Arrays.sort(nums);

		int lenght = nums.length;
		int largestPerimeterTriangle = 0;
		for (int i = lenght - 1; i >= 2; i--) {
			if (nums[i] < nums[i - 1] + nums[i - 2]) {
				largestPerimeterTriangle = nums[i] + nums[i - 1] + nums[i - 2];
				return largestPerimeterTriangle;
			}
		}
		return largestPerimeterTriangle;
	}
}