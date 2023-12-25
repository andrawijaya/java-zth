package com.learning.java_dasar;

public class _06TipeDataNumber {
    public static void main(String[] args) {
        // di java ada 2 tipe data number : Integer Number dan Floating Point Number
        // Integer Number adalah bilangan bulat
        // Floating Point Number adalah bilangan pecahan / decimal

        // Integer
        // 1. byte min: -128 -> max: 127, 1 byte di memory, default value = 0
        // 2. short min: -32,768 -> max: 32,767, 2 bytes di memory, default value = 0
        // 3. int min: -2,147,483,648 -> max: 2,147,483,647, 4 bytes di memory, default value = 0
        // 4. long min: -9,223,372,036,854,775,808 -> max: 9,223,372,036,854,775,807, 8 bytes, default value = 0

        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 1000000;
        long iniLong2 = 1000000L; // L di belakang nya untuk menandakan bahwa itu adalah tipe long

        // Floting Point Number
        // 1. float min: 3,4e-038 -> 3,4e+038 , ukuran 4 bytes, default value 0.0
        // 2. double min: 1,7e-308 -> 1.7e+308 , ukuran 8 bytes, default value 0.0

        float iniFloat = 10.12F;
        double iniDouble = 10.10;

        // Literal Number
        // 1. decimalInt : decimal biasa 25
        // 2. hexInt : pecahan 16
        // 3. binInt : binary

        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        // kode underscore pemisah angka;
        int amount = 1_000_000_000;
        long sum = 60_000_000;
        System.out.println(amount);
        System.out.println(sum);

    }
}
