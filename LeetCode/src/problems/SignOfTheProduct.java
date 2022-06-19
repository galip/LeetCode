package problems;

//https://leetcode.com/problems/sign-of-the-product-of-an-array/
public class SignOfTheProduct {
	public static void main(String args[]) {
		int[] nums = { 7,36,96,70,85,23,5,18,4,12,89,92,9,30,53,14,96,32,13,43,37,60,75,7,83,68,20,8,-24,-80,-27,-92,-96,-20,-16,-52,-49,-38 };
		
		System.out.println(arraySign(nums));
	}

	public static int arraySign(int[] nums) {
		int length = nums.length;
		int countOfNegativeNumbers = 0;
		for (int i = 0; i < length; i++) {
			if (nums[i] == 0)
				return 0;
			if(nums[i] < 0)
				countOfNegativeNumbers++;
		}
		if (countOfNegativeNumbers %2 == 0)
			return 1;
		return -1;
	}
}
