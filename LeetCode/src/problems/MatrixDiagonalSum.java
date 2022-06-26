package problems;

// https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagonalSum {
	public static void main(String args[]) {
//		int[][] mat = new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//		int[][] mat = new int[][] { {5} };
		int[][] mat = new int[][] { {1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		
		System.out.println(diagonalSum(mat));
	}

	public static int diagonalSum(int[][] mat) {
		int rowCount = mat.length;
		int sum = 0;
		for(int i = 0; i < rowCount; i++) {
			sum += mat[i][i] + mat[i][rowCount-1-i];
		}
		if(rowCount % 2 == 1)
			sum = sum - mat[rowCount/2][rowCount/2];
		return sum;
	}
}