package org.example.arrays.init.levelb;

public class ExcerAPrintAllPairs {
    public static void main(String[] args) {
        printPairs(new int[]{10, 20,30});
    }
    static void printPairs(int[] arr) {
        for(int i = 0 ; i <= arr.length / 2; i++) {
            for(int j = arr.length-1; j >= i ; j--) {
                System.out.print("("+arr[i]+", "+arr[j]+")  ");
            }
            System.out.println();
        }
    }
}
