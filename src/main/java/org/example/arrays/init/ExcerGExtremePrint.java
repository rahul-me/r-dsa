package org.example.arrays.init;

public class ExcerGExtremePrint {

    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40, 50};
        extremePrint(arr);

    }
    static void extremePrint(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int t;
        while(i <= j) {
            if(i == j) {
                System.out.print(arr[i]);
            } else {
            System.out.print(arr[i]+" "+arr[j]+" ");

            }
            i++; j--;
        }
    }
}
