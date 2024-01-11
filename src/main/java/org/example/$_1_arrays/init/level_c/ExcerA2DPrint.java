package org.example.$_1_arrays.init.level_c;

public class ExcerA2DPrint {

    public static void main(String[] args) {
        int[][] nums = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        print(nums);
    }

    static void print(int[][] arr) {
        System.out.println("printing array");

        for(int i = 0 ; i < arr.length; i++) {
            for(int j = 0 ; j < arr[i].length; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
