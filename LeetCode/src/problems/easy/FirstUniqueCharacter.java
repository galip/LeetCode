package problems.easy;

import java.util.HashMap;

// https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqueCharacter {
	public static void main(String args[]) {
		String s = "leetcode";
		
		System.out.println(firstUniqChar(s));
	}

	public static int firstUniqChar(String s) {
		char[] c = s.toCharArray();
		int length = s.length();
		
		HashMap<Character, Integer> map = new HashMap<>();
		Integer count = 1;
		for(int i = 0; i < length; i++) {
			count =	map.get(c[i]);
			if(count != null) {
				map.put(c[i], ++count);
			} else {
				map.put(c[i], 1);
			}
		}
		for(int i = 0; i < length; i++) {
			if(map.get(c[i]) == 1) {
				return i;
			}
		}
		return -1;
	}
}