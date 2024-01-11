package org.example.$_2_searching.level1;

public class Excer_C_BS_FindMissingNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{6, 7, 8, 9, 10, 11, 13};
        int missingNo = findMissingNumber(nums);
        System.out.println("missing number using BS (Binary Search)");
        System.out.println(missingNo);
    }

    public static int findMissingNumber(int[] nums) {
        int s = 0, e = nums.length - 1, m = 0;

        while (e-s != 1) {
            m = (e - s) / 2 + s;
            if ((m - s) == (nums[m] - nums[s])) {
                s = m;
            } else {
                e = m;
            }
        }

        return nums[s] + 1;
    }
}
