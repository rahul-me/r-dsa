package org.example.arrays.init.levelc;

public class ExcerD2DRowWiseSum {

    public static void main(String[] args) {
        int[][] nums = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        print(nums);

        printRowWiseSum(nums);

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

    static void printRowWiseSum(int[][] arr) {
        int sum;
        for(int i =0 ; i < arr.length; i++) {
            sum = 0;
            for(int j = 0 ; j < arr[i].length ;j++) {
                sum += arr[i][j];
            }
            System.out.println("Row "+(i+1)+" sum: "+sum);
        }
    }
}
