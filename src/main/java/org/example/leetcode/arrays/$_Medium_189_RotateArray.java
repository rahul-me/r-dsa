package org.example.leetcode.arrays;

import org.example.$_1_arrays.init.util.Print;

public class $_Medium_189_RotateArray {

    public static void main(String[] args) {

        int xx = 2 % 7;
        System.out.println(xx);
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
//        Print.$1D(nums);

        /**
         *
         * in O(n)
         * [1,2,3,4,5,6,7]
         * [1,2,3,4]  [5,6,7]
         * [4,3,2,1]  [7,6,5]
         * [5,6,7] [1,2,3,4]
         */
    }

    public static void rotate(int[] nums, int k) {
        int[] add = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            add[(i + k) % nums.length] = nums[i];

        }
        Print.$1D(add);
        nums = add;
        Print.$1D(nums);
    }
}
