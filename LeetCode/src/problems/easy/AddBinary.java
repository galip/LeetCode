package problems.easy;

// https://leetcode.com/problems/add-binary/
public class AddBinary {
	public static void main(String args[]) {
//		String a = "110";
//		String b = "1";

//		String a = "1010";
//		String b = "1011";

		String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		// "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"

		System.out.println(addBinary(a, b));

	}

	public static String addBinary(String a, String b) {
		char[] chA = a.toCharArray();
		char[] chB = b.toCharArray();

		int result = 0;
		int remainder = 0;
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		int length = chA.length > chB.length ? chA.length : chB.length;
		int tmpLength = length;
		int lengthA = chA.length;
		int lengthB = chB.length;
		int counter = 0;
		while (length > 0) {
			if (chA.length >= lengthA - 1 - counter && lengthA - 1 - counter >= 0) {
				result += Character.getNumericValue((chA[lengthA - 1 - counter]));
			}
			if (chB.length >= lengthB - 1 - counter && lengthB - 1 - counter >= 0) {
				result += Character.getNumericValue((chB[lengthB - 1 - counter]));
			}
			result += carry;
			remainder = result % 2;
			carry = result / 2;
			result = 0;
			sb.append(remainder);
			length--;
			counter++;
			if (tmpLength == counter && carry > 0) {
				sb.append(carry);
			}
		}
		return sb.reverse().toString();
	}
}