package problems.easy;

// https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
	public static void main(String args[]) {
//		int[][] accounts = {{1,2,3},{3,2,1}};

		int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };

		System.out.println(maximumWealth(accounts));
	}

	public static int maximumWealth(int[][] accounts) {
		int row = accounts.length;
		int col = accounts[0].length;
		int sum = 0;
		int max = 0;
		for (int i = 0; i < row; i++) {
			sum = 0;
			for (int j = 0; j < col; j++) {
				sum += accounts[i][j];
			}
			if (sum > max)
				max = sum;
		}
		return max;
	}
}
