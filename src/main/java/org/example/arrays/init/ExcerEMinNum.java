package org.example.arrays.init;

public class ExcerEMinNum {

    public static void main(String[] args) {
        int[] arr = new int[]{20, 4, 15, 2, 6, 8, 11, -51};
        int mn = min(arr);
        System.out.println("Minimum no: "+mn);
        int[] emptyarr = new int[5];
        min(emptyarr);
        min(new int[]{});
    }
    static int min(int[] arr) {
        if(arr.length == 0)
            throw new RuntimeException("arr is empty");
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }

        return min;
    }
}
