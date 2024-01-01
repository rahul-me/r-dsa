package org.example.arrays.init.levelc;

public class ExcerE2DColWiseSum {

    public static void main(String[] args) {
        int[][] nums = new int[][] {
                {1,2,3,1},
                {4,5,6,1},
                {7,8,9,1}
        };

        print(nums);

        printRowWiseSum(nums);

    }

    static void print(int[][] arr) {
        System.out.println("printing array");

        for(int i = 0 ; i < arr[0].length; i++) {
            for(int j = 0 ; j < arr.length; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }

    static void printRowWiseSum(int[][] arr) {
        int sum;

        for(int i = 0 ; i < arr[0].length; i++) {
            sum = 0;
            for(int j = 0 ; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println("Column "+(i+1)+" sum: "+sum);
        }
    }
}
