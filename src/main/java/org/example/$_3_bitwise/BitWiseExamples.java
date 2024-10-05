package org.example.$_3_bitwise;

public class BitWiseExamples {

    public static void main(String[] args) {
        // XOR

        int a = 5;
        int b = 10;

        /**
         * 0000 0101
         *
         *  2's complement of 5
         *  1111 1010
         * +0000 0001
         *  0000 1011
         */

        int result = a ^ b;
        System.out.println(result);
    }
}
