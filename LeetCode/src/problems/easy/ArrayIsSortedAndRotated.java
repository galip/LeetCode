package problems.easy;

// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated
public class ArrayIsSortedAndRotated {
    public static boolean check(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(isSorted(nums))
                return true;
            rotate(nums);
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = {3,4,5,1,2};

        System.out.println(check(nums));
    }

    private static boolean isSorted(int[] nums) {
        for(int i = 0; i < nums.length - 1; i ++) {
            if(nums[i] > nums[i+1]) {
                return false;
            }
        }
        return true;
    }

    private static int[] rotate(int[] nums) {
        int length = nums.length;
        int tmp = nums[0];

        for(int i = 0; i < length-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[length-1] = tmp;
        return nums;
    }
}
