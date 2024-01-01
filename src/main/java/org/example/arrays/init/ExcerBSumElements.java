package org.example.arrays.init;

import java.util.Scanner;

public class ExcerBSumElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0 ; i < 5; i++) {
            System.out.println("Enter your "+i+"th number");
            arr[i] = scanner.nextInt();
        }



//        for(int i =0 ; i < arr.length; i++) {
//            arr[i] = i+1;
//        }

        int sum = 0;

        for(int i = 0 ; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Printing sum: "+sum);

    }
}
