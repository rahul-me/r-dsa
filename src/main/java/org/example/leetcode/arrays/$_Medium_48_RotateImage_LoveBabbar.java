package org.example.leetcode.arrays;

import org.example.arrays.init.util.Print;

public class $_Medium_48_RotateImage_LoveBabbar {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {5,1,9,11,21},
                {2,4,8,10,36},
                {13,3,6,7,48},
                {15,14,12,16,50},
                {53,68,74,98,90}
        };

        Print.$2D(matrix);
        System.out.println();

        rotate(matrix);

        Print.$2D(matrix);

        System.out.println();
        System.out.println("second case");
        matrix = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("original");
        Print.$2D(matrix);
        rotate(matrix);
        System.out.println("rotated");
        Print.$2D(matrix);
        System.out.println();
        System.out.println("Third Case");

        matrix = new int[][]{
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };

        System.out.println("original");
        Print.$2D(matrix);
        rotate(matrix);
        System.out.println("rotated");
        Print.$2D(matrix);
    }

    public static void rotate(int[][] matrix) {
        int t;
        for(int i = 0 ; i < matrix.length; i++) {
            for(int j = i; j < matrix[i].length; j++) {
                t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

        for(int i = 0 ; i < matrix.length; i++) {
            for(int j = 0 ; j < matrix.length /2 ; j++) {
                t = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = t;
            }
        }

    }
}
