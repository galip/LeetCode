package problems.easy;

import java.util.HashMap;
import java.util.Map.Entry;

// https://leetcode.com/problems/isomorphic-strings/
public class IsomorphicStrings {
	public static void main(String[] args) {
		String s = "paper";
		String t = "title";
		
//		String s = "badc";
//		String t = "baba";
		
		System.out.println(isIsomorphic(s, t));		
	}

	public static boolean isIsomorphic(String s, String t) {
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		
		if(s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Character> isoHMap = new HashMap<>();
		
		int length = s.length();
		for(int i=0; i<length; i++) {
			if(isoHMap.get(sChar[i]) == null) {
				for (Entry<Character, Character> entry : isoHMap.entrySet()) {
		            if (entry.getValue().equals(tChar[i])) {
		            	return false;
		            }
		        }
				isoHMap.put(sChar[i], tChar[i]);
			} else {
				if(isoHMap.get(sChar[i]) != tChar[i]) {
					return false;
				}
			}
		}
		return true;
	}
}