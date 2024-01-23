package org.example.$_2_searching.level1;

import org.example.$_1_arrays.init.util.Print;

public class Excer_D_BS_PeakMountain {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 1, 0};
        System.out.println("original array");
        Print.$1D(arr);
        int index = peakIndexInMountainArray(arr);
        System.out.println("index");
        System.out.println(index);

        arr = new int[]{0,1,3,10,7,5,4,3,1,0};
        Print.$1D(arr);
        index = peakIndexInMountainArray(arr);
        System.out.println("index");
        System.out.println(index);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int s = 0, e = arr.length - 1, m = ((e - s) / 2 )+ s;

        while (!(arr[m - 1] < arr[m] && arr[m] > arr[m + 1])) {
            if (arr[m - 1] < arr[m] && arr[m] < arr[m + 1]) {
                s = m;
            } else {
                e = m;
            }
            m = ((e - s) / 2 + s);
        }

        return m;

    }
}
