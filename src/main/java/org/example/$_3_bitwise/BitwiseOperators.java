package org.example.$_3_bitwise;

public class BitwiseOperators {
    public static void main(String[] args) {
        // left and right shift operator
        // << and >>

        int a = 2;

        int res = a << 1;
        System.out.println(res);
        res = res << 1;
        System.out.println(res);

        a = 5;
        res = a << 5;
        System.out.println(res);

        a = 5;
        int b = 5;

        int c = a ^ b;
        System.out.println(c);

        b = 10;

        c = a & b;
        System.out.println("5 & 10:"+c);

        System.out.println("5 ^ 10:"+(a ^ b));

        System.out.println("5 ^ -5:"+(5 ^ -5));
    }
}
