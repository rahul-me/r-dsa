package org.example.leetcode.arrays;

import org.example.arrays.init.util.Print;

public class $_75_SortColors {

    public static void main(String[] args) {
        int[] nums = new int[] {2,0,2,1,1,0};
        sortColors(nums);
        Print.$1D(nums);
    }

    public static void sortColors(int[] nums) {
        int i = -1, j = nums.length, k = 0, t = 0;

        while(k != j) {
            if(nums[k] == 0) {
                i++;
                t = nums[i];
                nums[i] = nums[k];
                nums[k] = t;
                k++;
            } else if(nums[k] == 2) {
                j--;
                t = nums[k];
                nums[k] = nums[j];
                nums[j] = t;
                /**
                 * here we don't have to increase k
                 * because we don't know if replaced element is always 1, it can be any, we need to check it in next iteration.
                 */
            } else {
                k++;
            }
        }
    }
}
