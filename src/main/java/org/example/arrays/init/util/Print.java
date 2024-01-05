package org.example.arrays.init.util;

public class Print {

    public static void $1D(int[] arr) {
        System.out.println("Array:");
        for(int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void $2D(int[][] arr) {
        System.out.println("printing array");

        for(int i = 0 ; i < arr[0].length; i++) {
            for(int j = 0 ; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
