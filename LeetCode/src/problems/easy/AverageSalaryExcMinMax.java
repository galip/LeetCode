package problems.easy;

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class AverageSalaryExcMinMax {
	public static void main(String args[]) {

		int salary[] = { 48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000,
				28000, 4000, 54000, 67000, 6000, 1000, 11000 };

		System.out.println(average(salary));
	}

	public static double average(int[] salary) {
		int length = salary.length;
		double max = 0;
		double min = 1000000;
		double total = 0;
		for (int i = 0; i < length; i++) {
			if (salary[i] > max) {
				max = salary[i];
			}
			if (salary[i] < min) {
				min = salary[i];
			}
			total += salary[i];
		}
		double result = (total - (min + max)) / (length - 2);
		double factor = 100000;
		return Math.round(result * factor) / factor;
	}
}