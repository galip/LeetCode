package problems.easy;

// https://leetcode.com/problems/perfect-number/
public class PerfectNumber {
	public static void main(String[] args) {
//		int num = 28;
		int num = 7;
//		int num = 33550336;
//		int num = 120;
		System.out.println(checkPerfectNumber(num));
	}
	
	public static boolean checkPerfectNumber(int num) {
		int sum = 0;
		if(num % 2 == 1)
			return false;
		for(int i = 1; i<=num/2; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return num == sum;
    }
}
