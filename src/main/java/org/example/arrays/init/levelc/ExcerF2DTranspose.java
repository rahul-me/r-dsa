package org.example.arrays.init.levelc;

import org.example.arrays.init.util.Print;

public class ExcerF2DTranspose {

    public static void main(String[] args) {
        int[][] nums = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Array");
        Print.$2D(nums);

        int[][] transposed = transpose(nums);

        System.out.println("Transposed: ");
        Print.$2D(transposed);

    }

    static int[][] transpose(int[][] nums) {
        int t;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums[i].length; j++) {
                    t = nums[i][j];
                    nums[i][j] = nums[j][i];
                    nums[j][i] = t;
            }
        }
        return nums;
    }
}
