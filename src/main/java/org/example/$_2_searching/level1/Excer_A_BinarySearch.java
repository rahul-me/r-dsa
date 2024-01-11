package org.example.$_2_searching.level1;

public class Excer_A_BinarySearch {

    public static void main(String[] args) {
        int[] nums = new int[]{10, 20, 30, 40, 50, 60, 70, 80};
        int index = search(nums, 70);
        System.out.println("index");
        System.out.println(index);
        index = search(nums, 30);
        System.out.println("index");
        System.out.println(index);

    }

    public static int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1, m = 0;

        while (true) {
            m = s + ((e - s) / 2);
            if (nums[m] == target) {
                return m;
            } else if (target > nums[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
    }
}
