package problems.easy;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/maximum-units-on-a-truck/
public class MaximumUnitsOnTrack {
	public static void main(String args[]) {
		int[][] boxTypes = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } };
		int truckSize = 10;

		System.out.println(maximumUnits(boxTypes, truckSize));
	}

	public static int maximumUnits(int[][] boxTypes, int truckSize) {
		Arrays.sort(boxTypes, Comparator.comparingDouble(o -> o[1]));

		int length = boxTypes.length;
		int sum = 0;
		for (int i = length - 1; i >= 0; i--) {
			if (truckSize >= boxTypes[i][0] && truckSize != 0) {

				sum += (boxTypes[i][0] * boxTypes[i][1]);
				truckSize = truckSize - boxTypes[i][0];

			} else if (truckSize != 0) {
				sum += (truckSize * boxTypes[i][1]);
				truckSize = 0;
				return sum;
			}
		}
		return sum;
	}
}