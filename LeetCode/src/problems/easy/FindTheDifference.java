package problems.easy;

// https://leetcode.com/problems/find-the-difference/
public class FindTheDifference {
	public static void main(String args[]) {
		String s = "abcd";
		String t = "abcde";
		
//		String s = "a";
//		String t = "aa";
		
		System.out.println(findTheDifference(s, t));
	}

	public static char findTheDifference(String s, String t) {
		char[] sCh = s.toCharArray();
		char[] tCh = t.toCharArray();
		
		for(int i = 0; i < tCh.length; i++) {
			boolean found = false;
			for(int j = 0; j < sCh.length; j++) {
				if(tCh[i] == sCh[j]) {
					tCh[i] = '0';
					sCh[j] = '0';
					found = true;
					j = sCh.length;
				}
			}
			if(!found) {
				return tCh[i];
			}
		}
		for(int i = 0; i < tCh.length; i++) {
			if(tCh[i] != '0')
				return tCh[i];
		}
		return 0;
	}
}