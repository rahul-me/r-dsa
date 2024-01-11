package org.example.$_1_arrays.init.level_c;

import org.example.$_1_arrays.init.util.Print;

public class ExcerF2DTranspose {

    /**
     * Output
     *
     * Original Array
     * printing array
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * Transposed:
     * printing array
     * 1 4 7
     * 2 5 8
     * 3 6 9
     * @param args
     */

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
