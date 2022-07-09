package problems.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/sort-characters-by-frequency/
public class SortByFrequency {
	public static void main(String args[]) {
		String s = "tree";

		System.out.println(frequencySort(s));
	}

	public static String frequencySort(String s) {
		int length = s.length();
		char[] c = s.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();
		Integer count = 0;
		for (int i = 0; i < length; i++) {
			count = map.get(c[i]) == null ? 0 : map.get(c[i]);
			map.put(c[i], ++count);
		}

		LinkedHashMap<Character, Integer> resultMap = new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> resultMap.put(x.getKey(), x.getValue()));

		Integer val = 0;
		StringBuffer sb = new StringBuffer();
		Set<Character> keys = resultMap.keySet();
		for (Character key : keys) {
			val = resultMap.get(key);
			for (int j = 0; j < val; j++) {
				sb.append(key);
			}

		}
		return sb.toString();
	}
}