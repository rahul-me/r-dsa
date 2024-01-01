package org.example.arrays.init.levelc;

import java.util.Scanner;

public class ExcerC2DFindTarget {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nums = new int[3][4];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0 ; j < nums[i].length; j++) {
                System.out.println("Enter element at ["+i+"]["+j+"]");
                nums[i][j] = scanner.nextInt();
            }
        }
        print(nums);


    }

    static void print(int[][] arr) {
        System.out.println("printing array");

        for(int i = 0 ; i < arr.length; i++) {
            for(int j = 0 ; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static boolean findTarget(int[][] nums, int target) {
        for(int i = 0 ; i < nums.length; i++) {
            for(int j = 0 ; j < nums[i].length; i++) {
                if(target == nums[i][j])
                    return true;
            }
        }
        return false;
    }
}
