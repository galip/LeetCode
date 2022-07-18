package problems.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle-ii/
public class PascalTriangle2 {
	public static void main(String args[]) {
		int rowIndex = 33;

		System.out.println(generate(rowIndex));
	}

	public static List<Integer> generate(int rowIndex) {
		List<Integer> lines = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();
		if (rowIndex == 0) {
			lines.add(1);
			return lines;
		}

		for (int j = 0; j <= rowIndex; j++) {
			lines = new ArrayList<>();
			for (int i = 0; i <= j; i++) {
				if (i == 0 || i == j) {
					lines.add(1);
				} else {
					lines.add(Integer.sum(list.get(j - 1).get(i - 1), list.get(j - 1).get(i)));
				}
			}
			list.add(lines);
		}

		return lines;
	}
}