package problems.easy;

// https://leetcode.com/problems/next-greater-element-i/
public class NextGreaterElementI {
	public static void main(String args[]) {

//		int[] nums1 = { 2, 4 };
//		int[] nums2 = { 1, 2, 3, 4 };
		
//		int[] nums1 = {3,1,5,7,9,2,6};
//		int[] nums2 = {1,2,3,5,6,7,9,11};
		
		int[] nums1 = {1,3,5,2,4};
		int[] nums2 = {6,5,4,3,2,1,7};

		int[] output = new int[nums1.length];
		output = nextGreaterElement(nums1, nums2);

		for (int i = 0; i < output.length; i++)
			System.out.println(output[i]);
	}

	private static int findNextBigger(int x, int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			if (x == arr[i]) {
				for (int j = i + 1; j < length; j++) {
					if (j < length && x < arr[j]) {
						return arr[j];
					}
				}
				return -1;
			}
		}
		return -1;
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] tmpArr = new int[nums1.length];
		int counter = 0;
		for (int i = 0; i < nums1.length; i++) {
			tmpArr[i] = findNextBigger(nums1[i], nums2);
			if (tmpArr[i] != 0)
				counter++;
		}

		int[] output = new int[counter];
		for (int i = 0; i < counter; i++) {
			output[i] = tmpArr[i];
		}

		return output;
	}
}
