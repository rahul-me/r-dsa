package org.example.$_1_arrays.init.level_b;

public class ExcerBPrintTriplets {

    public static void main(String[] args) {
        printTriplets(new int[] {1,2,3,4});
    }

    static void printTriplets(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    System.out.print("("+arr[i]+", "+arr[j]+", "+arr[k]+")  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
