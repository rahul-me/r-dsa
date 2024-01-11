package org.example.$_1_arrays.init;

public class ArrayInit {
    public static void main(String[] args) {
        int[] a;

        int[] b;


        a = new int[5];

        //         Not possible to assign this way
//        a = {0,1,2};

        int e = 2;
        int[] x = new int[e];

        int[] myarr = new int[10];

        for(int i: myarr) {
            System.out.println(i);
        }

        for(int f: myarr)
            System.out.println(f);
// Assignment does not work
//        for(int i: myarr)
//            int dd = 1;


    }

}
