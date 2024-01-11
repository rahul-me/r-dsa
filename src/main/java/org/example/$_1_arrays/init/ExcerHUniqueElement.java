package org.example.$_1_arrays.init;

public class ExcerHUniqueElement {
    public static void main(String[] args) {
        int[] arr = new int[] {2,10,11,13,10,2,15,13,15};
        int u = unique(arr);
        System.out.println("Unique element: "+u);
    }
    static int unique(int[] arr) {
        int xor = arr[0];
        for(int i = 1; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
