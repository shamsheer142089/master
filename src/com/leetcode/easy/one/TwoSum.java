/**
 * 
 */
package com.leetcode.easy.one;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Admin
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int[] indices = twoSum(nums, 9);
		System.out.println(indices[0]);
		System.out.println(indices[1]);
		
		int[] nums1 = { 3,2, 4};
		int[] indices1 = twoSum(nums1, 6);
		System.out.println(indices1[0]);
		System.out.println(indices1[1]);
	}

	private static int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];
		Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		for (int cnt = 0; cnt < nums.length; cnt++) {
			if (numbers.containsKey(target - nums[cnt])) {
				indices[1] = cnt;
				indices[0] = numbers.get(target - nums[cnt]);
				return indices;
			} else {
				numbers.put(nums[cnt], cnt);
			}

		}
		return indices;
	}
}
