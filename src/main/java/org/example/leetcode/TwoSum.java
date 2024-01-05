package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[] {11,15, 2, 7};
        int[] rs = twoSum(nums, 9);
        System.out.println(Arrays.toString(rs));
    }

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int i = 0;
        while(map.get(nums[i]) == null) {
            map.put(target-nums[i], i);
            i++;
        }
        return new int[] {i, map.get(nums[i])};
    }
}
