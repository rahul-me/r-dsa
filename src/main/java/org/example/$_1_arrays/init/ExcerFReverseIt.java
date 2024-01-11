package org.example.$_1_arrays.init;

public class ExcerFReverseIt {

    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40, 50, 60};

        System.out.println("Printing original array");
        print(arr);

        reverse(arr);

        System.out.println("Printing reversed array");
        print(arr);

        System.out.println("Again reversing");
        reverseUsingWhile(arr);
        print(arr);
    }

    static int[] reverse(int[] arr) {
        int toIndex = arr.length / 2;
        int l = arr.length;
        int cli;
        int t;
        for(int i = 0; i < toIndex; i++) {
            t = arr[i];
            cli = (l-1)-i;
            arr[i] = arr[cli];
            arr[cli] = t;
        }
        return arr;
    }

    static int[] reverseUsingWhile(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int t;
        while(i < j) {
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

            i++; j--;
        }
        return arr;
    }



    static void print(int[] arr) {
        System.out.println("Printing array:");
        for(int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
