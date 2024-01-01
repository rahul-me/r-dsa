package org.example.arrays.init.levelb;

import org.example.arrays.init.util.Print;

public class ExcerEShiftElementByOne {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50,60};
        System.out.println("Original: ");
        Print.all(arr);

        System.out.println("After Shift: ");
        shitf(arr);
        Print.all(arr);
    }
    static int[] shitf(int[] arr) {
        int t;
        for(int i = 0; i < arr.length -1 ; i++) {
            t = arr[0];
            arr[0] = arr[i+1];
            arr[i+1] = t;
        }
        return arr;
    }
}
