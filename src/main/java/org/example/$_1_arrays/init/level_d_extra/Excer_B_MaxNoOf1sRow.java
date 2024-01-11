package org.example.$_1_arrays.init.level_d_extra;

public class Excer_B_MaxNoOf1sRow {
    public static void main(String[] args) {
        int[][] nums = new int[][] {
                {1,0,0,0},
                {0,1,1,0},
                {1,1,1,0},
                {1,0,0,1},
                {0,0,0,1}
        };

        int res = max1Row(nums);
        System.out.println("max 1's row index");
        System.out.println(res);
    }

    public static int max1Row(int[][] nums) {

        int s, ms = 0, r = 0;
        for(int i = 0 ; i < nums.length; i++) {
            s = 0;
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] == 1)
                    s++;
            }
            if(s > ms) {
                ms = s;
                r = i;
            }
        }
        return r;
    }
}
