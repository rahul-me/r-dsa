package org.example.leetcode.arrays;

import org.example.$_1_arrays.init.util.Print;

import java.util.LinkedList;
import java.util.Queue;

public class $_Medium_48_RotateImage_Rahul {

    /**
     *
     * Leetcode: https://leetcode.com/problems/rotate-image/description/
     *
     * Output:
     *
     * printing array
     * 5 1 9 11 21
     * 2 4 8 10 36
     * 13 3 6 7 48
     * 15 14 12 16 50
     * 53 68 74 98 90
     *
     * printing array
     * 53 15 13 2 5
     * 68 14 3 4 1
     * 74 12 6 8 9
     * 98 16 7 10 11
     * 90 50 48 36 21
     *
     * second case
     * original
     * printing array
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * rotated
     * printing array
     * 7 4 1
     * 8 5 2
     * 9 6 3
     *
     * Third Case
     * original
     * printing array
     * 5 1 9 11
     * 2 4 8 10
     * 13 3 6 7
     * 15 14 12 16
     * rotated
     * printing array
     * 15 13 2 5
     * 14 3 4 1
     * 12 6 8 9
     * 16 7 10 11
     *
     * @param args
     */

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

        Queue<Integer> que = new LinkedList<>();
        /**
         *
         * [O, Oo]
         * [Pp, P]
         * [Q, Qq]
         * [Rr, R]
         *
         */
        int x = 0, y = matrix.length - 1;
        int O = 0, P = matrix.length-1, Q = matrix.length -1 , R = 0;
        int sub_matrix_length = matrix.length-1;

        int depth = matrix.length / 2;

        while(depth > 0) {

            while (x < sub_matrix_length) {

                que.offer(matrix[x][P]);
                matrix[x][P] = matrix[O][x];
                que.offer(matrix[Q][y]);
                matrix[Q][y] = que.poll();
                que.offer(matrix[y][R]);
                matrix[y][R] = que.poll();
                matrix[O][x] = que.poll();

                x++;
                y--;
            }


            O++; R++; P--; Q--;
            depth--;
            x = O; y = P;
            sub_matrix_length -= 1;
        }




    }
}
