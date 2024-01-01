package org.example.arrays.init.levelb;

import static org.example.arrays.init.util.Print.all;

public class ExcerDSortZeroOnesTwoPointer {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,1,1,0,0,0,0};
        all(arr);
        arr = sortZeroOnes(arr);
        all(arr);
    }
    static int[] sortZeroOnes(int[] arr) {

        int k = 0, i = -1, j = arr.length, t;

        while(k < j) {
            if(arr[k] == 0) {
                i++;
                k++;
            } else if(arr[k] == 1) {
                j--;
                t = arr[k];
                arr[k] = arr[j];
                arr[j] = t;
            }
            all(arr);
            printps(i,j,k,arr);
            System.out.println("i: "+i);
            System.out.println("j: "+j);
            System.out.println("k: "+k);
        }



        return arr;

    }

    static void printps(int i, int j, int k, int[] arr) {
        for(int a = 0; a< arr.length; a++) {
            if( a == i) {
                System.out.print("i ");
            } else if( a == j) {
                System.out.print("j ");
            } else if(a == k) {
                System.out.print("k ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
}
