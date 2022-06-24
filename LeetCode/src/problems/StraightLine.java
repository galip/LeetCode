package problems;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/check-if-it-is-a-straight-line/
public class StraightLine {
	public static void main(String args[]) {
		
		int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}; // true
//		int[][] coordinates = {{0,0},{0,5},{5,5},{5,0}}; // false
//		int[][] coordinates = {{1,-8},{2,-3},{1,2}}; // false
		
		System.out.println(checkStraightLine(coordinates));
	}

	public static boolean checkStraightLine(int[][] coordinates) {
		Arrays.sort(coordinates, Comparator.comparingDouble(o -> o[0]));
		
		int length = coordinates.length;
		int xDiff = 0;
		int yDiff = 0;
		double slope = 0;
		double tmp = 0;
		for(int i = 0; i < length-1; i++) {
			tmp = xDiff != 0 ? (double) yDiff / xDiff : 90;	
			xDiff = Math.abs(coordinates[i+1][0] - coordinates[i][0]);
			yDiff = Math.abs(coordinates[i+1][1] - coordinates[i][1]);
			slope = xDiff == 0 ? 90 : (double) yDiff / xDiff;		
			if(i> 0 && slope != (double)(tmp)) {
				return false;
			}
		}
		return true;
	}
}
