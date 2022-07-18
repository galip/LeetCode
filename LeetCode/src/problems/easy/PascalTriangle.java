package problems.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/
public class PascalTriangle {
	public static void main(String args[]) {
		int numRows = 30;

		System.out.println(generate(numRows));
	}

	public static List<List<Integer>> generate(int numRows) {
		List<Integer> lines = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();
		if (numRows == 0) {
			lines.add(1);
			list.add(lines);
			return list;
		}

		for (int j = 0; j < numRows; j++) {
			for (int i = 0; i <= j; i++) {
				if (i == 0 || i == j) {
					lines.add(1);
				} else {
					lines.add(Integer.sum(list.get(j - 1).get(i - 1), list.get(j - 1).get(i)));
				}
			}
			list.add(lines);
			lines = new ArrayList<>();
		}

		return list;
	}
}