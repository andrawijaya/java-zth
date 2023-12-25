package com.learning.java_dasar;

public class _06KonversiNumber {
    public static void main(String[] args) {

        // konversi tipe data number
        // 1. Widening Casting (Otomatis): byte -> short -> int -> long -> float -> double
        // 2. Narrowing Casting (Manual): double -> float -> long -> int -> char -> short -> byte

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        System.out.println(iniInt);

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;
        System.out.println(iniByte2);
    }
}
