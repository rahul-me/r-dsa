package org.example.leetcode.arrays;

public class $_268_MissingNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        nums = new int[] {0,1,2, 3};
        int ms = missingNumber(nums);
        System.out.println("missing number");
        System.out.println(ms);
    }

    public static int missingNumber(int[] nums) {
        int s = 0, as = 0;

        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }

        as = ((nums.length+1) * (nums.length)) / 2;
        // you will make a mistake calculating actual sum
        // here you need to consider array length for which missing number is already there
        // actual length of array + 1

        return as - s;
    }
}
