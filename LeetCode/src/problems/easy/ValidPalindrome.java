package problems.easy;

// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
//		String s = "race a car";
		
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		int firstIndex = 0;
		int lastIndex = s.length()-1;
		
		char[] c = s.toCharArray();
		while(firstIndex <= lastIndex) {
			if(!Character.isLetterOrDigit(c[firstIndex])) {
				firstIndex++;
			} else if(!Character.isLetterOrDigit(c[lastIndex])) {
				lastIndex--;
			} else {
				if((Character.isLetterOrDigit(c[firstIndex])) && Character.isLetterOrDigit(c[lastIndex])) {
					if(Character.toLowerCase(c[firstIndex]) != Character.toLowerCase(c[lastIndex])) {
						return false;
					}
				}
				firstIndex++;
				lastIndex--;
			}
		}
		return true;
    }
}