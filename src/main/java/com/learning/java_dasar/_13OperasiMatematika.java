package com.learning.java_dasar;

public class _13OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 9;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // augmented assigment
        // operasi ke dirinya sendiri
        int c = 100;
        c+=10;
        System.out.println(c);

        c-=10;
        System.out.println(c);

        c *=10;
        System.out.println(c);

        // unary operator
        // operator yang di tempatkan di depan variable, a++
        // biasanya cuma butuh 1 data
        // increment +1, decrement -1
        int d = 100;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);
        System.out.println(!true);
    }
}
