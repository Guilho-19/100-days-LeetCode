package day002;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
	public static int[] sum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		int[] nums = {3, 2, 4};
		int target = 6;
		int[] result = sum(nums, target);
		
		System.out.println(Arrays.toString(result));
	}
}
