package problems.easy;

// https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
	public static void main(String args[]) {
		String s = "Hello World ";
		
		System.out.println(lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s) {
		String[] tmp = s.split(" ");
		String lastWord = tmp[tmp.length-1];
		return lastWord.length();
	}
}