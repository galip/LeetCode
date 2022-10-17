package problems.easy;

import java.util.Hashtable;

public class CheckSentenceIsPangram {
	public static void main(String args[]) {
		
		String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
		
		String sentence2 = "leetcode";
		
		System.out.println(checkIfPangram(sentence1));
		
		System.out.println(checkIfPangram(sentence2));
	}
	
	public static boolean checkIfPangram(String sentence) {
		
		char[] controlArr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
		char[] ch1 = sentence.toCharArray();
		
		int count = 0;
		for(Character ch : ch1) {
			ht.put(ch, 1);
			
			if(ht.size() >= controlArr.length) {
				for(int i = 0; i < controlArr.length; i++) {
					if(ht.get(ch1[i]) == 1) {
						count++;
					}
				}
				
				if(count == controlArr.length) {
					return true;
				}
				count = 0;
			}
		}
		return false;
    }
}
