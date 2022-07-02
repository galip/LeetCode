package problems.medium;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/submissions/
public class MaximumAreaPieceOfCake {
	public static void main(String args[]) {
		int h = 5;
		int w = 2;
//		int[] horizontalCuts = {1,2,4};
//		int[] verticalCuts =  {1,3};
		
//		int[] horizontalCuts = {3,1};
//		int[] verticalCuts =  {1};
		
//		int[] horizontalCuts = {3};
//		int[] verticalCuts =  {3};
		
//		int[] horizontalCuts = {2};
//		int[] verticalCuts =  {2};
		
		int[] horizontalCuts = {3,1,2};
		int[] verticalCuts =  {1};
		
		System.out.println(maxArea(h, w, horizontalCuts, verticalCuts));
	}

	private static int findMaxCuts(int[] arr, int val) {
		int length = arr.length;
		Arrays.sort(arr);
		int max = arr[0];
		
		if(length == 1)
			return (val - arr[0]) > arr[0] ? (val - arr[0]) : arr[0];
		
		for(int i = 0; i < length-1; i++) {
			if((arr[i+1] - arr[i]) > max) {
				max = arr[i+1] - arr[i];
			}
			if(i+1 == (length -1) && (val - arr[i+1]) > max) {
				max = val - arr[i+1];
			}
		}
		return max;
	}

	public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
		long maxHorizantal = findMaxCuts(horizontalCuts, h);
		long maxVertical = findMaxCuts(verticalCuts, w);
		return (int) (((maxHorizantal) * (maxVertical))%1000000007);
	}
}