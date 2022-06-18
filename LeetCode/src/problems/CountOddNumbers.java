package problems;

//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
public class CountOddNumbers {
	public static void main(String args[]) {
	
		int low = 278382788;
		int high = 569302584;
		
		countOdds(low, high);
		
		System.out.println(countOdds(low, high));
	}
	
	public static int countOdds(int low, int high) {
		int boundaryOddCount = 0;
		if(low % 2 == 1 || high % 2 == 1) {
			boundaryOddCount++;
		}
		
		return  ((high - low) / 2) + (boundaryOddCount > 0 ? 1 :0);
    }
}