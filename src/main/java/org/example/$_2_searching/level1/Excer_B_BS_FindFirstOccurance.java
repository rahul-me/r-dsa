package org.example.$_2_searching.level1;

/**
 * Output:
 *
 * index
 * 2
 * duplicate elements in array-index of first occurrence
 * 0
 * duplicate elements in array-index of first occurrence
 * 1
 * duplicate elements in array-index of first occurrence
 * 4
 */
public class Excer_B_BS_FindFirstOccurance {

    public static void main(String[] args) {
        int[] nums = new int[]{10, 20, 30, 40, 50, 60, 70, 80};
        int index = searchFirst(nums, 70);
        System.out.println("index");
        System.out.println(index);
        index = searchFirst(nums, 30);
        System.out.println("index");
        System.out.println(index);
        nums = new int[]{30, 30, 30, 30, 30, 30, 40, 50};
        index = searchFirst(nums, 30);
        System.out.println("duplicate elements in array-index of first occurrence");
        System.out.println(index);

        nums = new int[]{10, 30, 30, 30, 30, 30, 40, 50};
        index = searchFirst(nums, 30);
        System.out.println("duplicate elements in array-index of first occurrence");
        System.out.println(index);

        nums = new int[]{10, 30, 30, 20, 30, 30, 40, 50};
        index = searchFirst(nums, 30);
        System.out.println("duplicate elements in array-index of first occurrence");
        System.out.println(index);

        nums = new int[]{10, 20, 30, 30, 30, 30, 40, 50};
        index = searchLast(nums, 30);
        System.out.println("duplicate elements in array-index of last occurrence");
        System.out.println(index);


        System.out.println();
        System.out.println("finding number of occurrences");
        int firstIndex = searchFirst(nums, 30);
        int lastIndex = searchLast(nums, 30);
        System.out.println("first: "+firstIndex);
        System.out.println("last: "+lastIndex);
        System.out.println(lastIndex - firstIndex + 1);
    }

    public static int searchFirst(int[] nums, int target) {
        int s = 0, e = nums.length - 1, m = 0;

        while (true) {
            m = s + ((e - s) / 2);
            if (nums[m] == target) {
                if (m > 0 && nums[m - 1] == target) {
                    e = m - 1;
                } else {
                    return m;
                }
            } else if (target > nums[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
    }

    public static int searchLast(int[] nums, int target) {
        int s = 0, e = nums.length - 1, m = 0;

        while (true) {
            m = s + ((e - s) / 2);
            if (nums[m] == target) {
                if (m > 0 && nums[m + 1] == target) {
                    s = m + 1;
                } else {
                    return m;
                }
            } else if (target > nums[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
    }
}
