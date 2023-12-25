package com.learning.java_dasar;

public class _11TipeDataBukanPrimitif {
    public static void main(String[] args) {
        // tipe data primitif adalah tipe bawaan di dalam bahasa pemprograman, tipe data primitif tidak bisa diubah lagi
        // tipe data number, char, boolean adalah tipe data primitif. tipe data primitif selalu memiliki default value
        // tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
        // tipe data bukan primitif bisa memiliki method/function
        // di java, semua tipe data primitif memiliki representasi tipe data bukan primitifnya

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte;
        iniByte = null;
        byte byte1 = 0;
        System.out.println(byte1);

        Byte konversi = byte1;
        System.out.println(konversi.getClass().getSimpleName());

        // konversi dari yang bukan primitif ke primitif
        short iniShort = konversi.shortValue();

    }
}
