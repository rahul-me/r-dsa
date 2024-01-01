package org.example.arrays.init;

public class ExcerDCountZerosAndOnes {

    public static void main(String[] args) {
        countZeroOnes(new int[]{0,1,1,1,0,0,1,1});
        // No of 0: 3
        // No of 1: 5
    }
    static void countZeroOnes(int[] arr) {
        int cz = 0;
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] == 0)
                cz++;
        }

        System.out.println("Number of zeros: "+cz);
        System.out.println("Number of ones: "+(arr.length-cz));
    }
}
