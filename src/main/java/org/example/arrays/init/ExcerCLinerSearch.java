package org.example.arrays.init;

public class ExcerCLinerSearch {

    public static void main(String[] args) {
        int[] arr = new int[] {2,4,6,8,10,12};
        int resI = linearSearch(arr, 11);
        System.out.println("Index: "+resI);
    }

    static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
