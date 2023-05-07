package problems.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		int[] result = intersection(nums1, nums2);
		
		for(int i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(int i:nums1)
			set1.add(i);
		
		for(int i : nums2)
			set2.add(i);
		
		Set<Integer> resultSet = new HashSet<>();
		for(Integer i : set1) {
			if(set2.contains(i) ) {
				resultSet.add(i);
			}
		}
		
		// convert to int array
		int[] resultIntArr = new int[resultSet.size()];
		int i = 0;
		for(int j : resultSet) {
			resultIntArr[i] = j;
			i++;
		}
		return resultIntArr;
    }
}