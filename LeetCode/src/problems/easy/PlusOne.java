package problems.easy;

// https://leetcode.com/problems/plus-one/
public class PlusOne {
	public static void main(String args[]) {
//		int[] digits = {1,2,3};
		
		int[] digits = {9};
		
		System.out.println(plusOne(digits));
	}

	public static int[] plusOne(int[] digits) {
		int length = digits.length;
		int[] result = new int[length+1];
		int val = 0;
		int remainder = 0;
		int tenner = 0;
		for (int i = (length-1); i >= 0; i--) {
			if(i == (length-1)) {
				val = digits[i] + tenner + 1;
			} else {
				val = digits[i] + tenner;
			}
			tenner = val / 10;
			remainder = val % 10;
			result[i+1] = remainder;
		}
		if(tenner > 0) {
			result[0] = tenner;
			return result;
		} else {
			for(int i = length; i > 0; i--) {
				digits[i-1] = result[i];
			}
			return digits;
		}
	}
}