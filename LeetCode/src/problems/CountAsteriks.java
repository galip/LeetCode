package problems;

// https://leetcode.com/contest/biweekly-contest-81/problems/count-asterisks/
public class CountAsteriks {
	public static void main(String args[]) {
		String s = "l|*e*et|c**o|*de|";
		
		System.out.println(countAsterisks(s));
	}
	
	public static int countAsterisks(String s) {
		char[] tokens = s.toCharArray();
		
		int count = 0;
		int result = 0;
		for(int i = 0; i < tokens.length; i++) {
			if(tokens[i] != '|') {
				if(count % 2 == 0 && tokens[i] == '*') {
					result ++;
				}
			} else {
				count ++;
			}
		}
		return result;
    }
}