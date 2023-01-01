package problems.easy;

import java.util.HashMap;
import java.util.Map.Entry;

// https://leetcode.com/problems/word-pattern/description/
public class WordPattern {
	public static void main(String args[]) {
		String s = "dog dog dog dog";
		String pattern = "abba";

		boolean result = wordPattern(pattern, s);

		System.out.println(result);

	}

	public static boolean wordPattern(String pattern, String s) {
		String[] splitedString = s.split("\\s+");
		char p[] = pattern.toCharArray();

		if (p.length != splitedString.length)
			return false;

		HashMap<Character, String> hMap = new HashMap<>();
		int counter = 0;

		for (Character c : p) {
			if (hMap.get(c) == null) {
				for (Entry<Character, String> entry : hMap.entrySet()) {
					if (entry.getValue().equals(splitedString[counter])) {
						return false;
					}
				}
				hMap.put(c, splitedString[counter]);
			} else {
				if (!hMap.get(c).equals(splitedString[counter])) {
					return false;
				}
			}
			counter++;
		}
		return true;
	}
}