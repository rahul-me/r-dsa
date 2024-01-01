package org.example.arrays.init.levelb;

import org.example.arrays.init.util.Print;

import static org.example.arrays.init.util.Print.all;

public class ExcerCSortZeroOnesCounting {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,1,1,0,0,0,0};
        all(arr);
        arr = sortZeroOnes(arr);
        all(arr);
    }
    static int[] sortZeroOnes(int[] arr) {
        int zs = 0, os = 0;

        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] == 0){
                zs++;
            } else {
                os++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(i<zs) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        return arr;

    }
}
