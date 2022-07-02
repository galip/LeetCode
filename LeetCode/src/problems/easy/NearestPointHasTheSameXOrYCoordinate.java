package problems.easy;

// leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
public class NearestPointHasTheSameXOrYCoordinate {
	public static void main(String args[]) {
		int x = 5;
		int y = 1;
		//int[][] points = {{1,2},{3,1},{2,4},{2,3},{4,4}};
//		int[][] points = {{2,3}};
		int[][] points = {{1,1},{6,2},{1,5},{3,1}};
		
		System.out.println(nearestValidPoint(x, y, points));
	}

	public static int nearestValidPoint(int x, int y, int[][] points) {
		int length = points.length;
		int j = 0;
		int minSum = Integer.MAX_VALUE;
		int foundIndex = -1;
		int distance = 0;
		for(int i = 0; i < length ; i ++) {
				if((points[i][j] == x) || (points[i][j+1] == y)) {
					distance = (Math.abs(points[i][j] - x)) + Math.abs((points[i][j+1] - y));
					if(minSum > distance) {
						minSum = distance;
						foundIndex = i;
					}
				}
		}
		return foundIndex;
	}
}
