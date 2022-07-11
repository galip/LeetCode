package problems.easy;

import java.util.HashMap;

// https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
	public static void main(String args[]) {
		String s = "MCMXCIV";
		
		System.out.println(romanToInt(s));

	}

	public static int romanToInt(String s) {
		HashMap<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		char[] c = s.toCharArray();
		
		int sum = 0;
		int diff = 0;
		for(int i = 0; i < (c.length-1); i++) {
			if(c[i] == 'I' && (c[i+1] == 'V' || c[i+1] == 'X')) {
				diff = 2;
			}
			if(c[i] == 'X' && (c[i+1] == 'L' || c[i+1] == 'C')) {
				diff = 20;
			}
			if(c[i] == 'C' && (c[i+1] == 'D' || c[i+1] == 'M')) {
				diff = 200;
			}
			if(i == (c.length-1)) {
				sum = sum + c[i+1];
			}
			sum = sum + romanMap.get(c[i]) - diff;
			diff = 0;
		}
		return sum + romanMap.get(c[c.length-1]);
	}

}