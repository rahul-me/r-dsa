package org.example.$_1_arrays.init;

public class ExcerADoubleEachValueArray {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        print(arr);

        System.out.println("Doubling each value");
        for(int i = 0; i < arr.length; i++)
            arr[i] = arr[i] * 2;

        print(arr);

    }

    static void print(int[] arr) {
        System.out.println("Printing Array:");
        for(int a : arr) {
            System.out.println(a);
        }
    }
}
