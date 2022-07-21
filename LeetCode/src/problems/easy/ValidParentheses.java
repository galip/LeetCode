package problems.easy;

import java.util.HashMap;
import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
	public static void main(String args[]) {
		String s = "()[{}]{}([{{}}])";

		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		Stack<Character> stack = new Stack<>();
		Stack<Character> controlStack = new Stack<>();

		char[] c = s.toCharArray();

		int length = s.length();
		if (length == 1)
			return false;

		for (int i = length - 1; i >= 0; i--) {
			stack.push(c[i]);
		}

		while (stack.size() > 0) {
			Character ca = stack.pop();
			if (map.containsValue(map.get(ca))) {
				controlStack.push(map.get(ca));
			} else { // value yok
				if (controlStack.size() > 0 && ca.equals(controlStack.pop())) {
					continue;
				} else {
					return false;
				}
			}
		}
		if (controlStack.size() > 0)
			return false;
		return true;
	}
}