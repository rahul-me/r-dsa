package org.example.arrays.init.level_d_extra;

import org.example.arrays.init.util.Print;

public class Excer_A_MoveNegativeToLeftAndPositiveToRight {

    public static void main(String[] args) {
        int[] nums = new int[] {23, -7, 12, -10, -1, 40, 60};
        int [] res = moveNegPos(nums);
        Print.$1D(res);
    }
    static int[] moveNegPos(int[] nums) {

        int i = -1, k = 0;
        while(k < nums.length){
            if(nums[k] < 0) {
                i++;
                swap(i, k, nums);
            } else {
                k++;
            }
        }
        return nums;
    }

    static void swap(int i, int k, int[] nums) {
        int t = nums[i];
        nums[i] = nums[k];
        nums[k] = t;
    }
}
