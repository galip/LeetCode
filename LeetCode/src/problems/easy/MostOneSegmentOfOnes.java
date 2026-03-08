package problems.easy;

// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
public class MostOneSegmentOfOnes {
	public static void main(String args[]) {
		
		String s = "11110011";
		boolean result = checkOnesSegment(s);
		System.out.println(result);
		
	}
	
	public static boolean checkOnesSegment(String s) {
		
		char arr[] = s.toCharArray();
		boolean inSegment = false;
		int segmentCount = 0;
		
		for(char c : arr) {
			
			if(c == '1') {
				if(!inSegment) {
					segmentCount++;
					inSegment = true;
				}
			} else {
				inSegment = false;
			}
			
			if(segmentCount > 1)
				return false;
		}
		
		return true;
    }
}
