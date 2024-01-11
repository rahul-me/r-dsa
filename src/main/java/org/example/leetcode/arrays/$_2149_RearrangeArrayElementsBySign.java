package org.example.leetcode.arrays;

import org.example.$_1_arrays.init.util.Print;

public class $_2149_RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,-2, -5, 2, -4};
        System.out.println("input");
        Print.$1D(nums);
        int[] res = rearrangeArray(nums);
        System.out.println("output");
        Print.$1D(res);
    }
    public static int[] rearrangeArray(int[] nums) {
        int[] a = new int[nums.length/2] , b = new int[nums.length/2], c = new int[nums.length];
        int x = 0, y = 0;
        for(int e : nums) {
            if(e < 0) {
                a[x++] = e;
            } else {
                b[y++] = e;
            }
        }

        x=0; y=0;
        while((x+y) < nums.length) {
            if(x==y) {
                c[x+y] =  b[x++];
            } else {
                c[x+y] = a[y++];
            }
        }

        return c;
    }
}
