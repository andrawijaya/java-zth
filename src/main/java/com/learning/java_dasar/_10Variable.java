package com.learning.java_dasar;

public class _10Variable {
    public static void main(String[] args) {
        // variable adalah tempat untuk menyimpan data
        // java adalah static tipe, sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang sama, tidak bisa berubah2 tipe data nya seperti bahasa js atau php
        // untuk membuat variable di java kita bisa menggunakan nama tipe data lalu di ikuti dengan nama variable nya
        // nama variable tidak boleh mangandung whitespace (spasi, enter, tab), dan tidak boleh seluruhnya number

        String name;
        name = "Andra Wijaya";

        // langsung initialization
        int age = 30;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        name = "Jokowi";
        System.out.println(name);

        // kata kunci final
        // secara default, variable di java bisa diubah-ubah nilainya
        // jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci final
        // istilah variable seperti ini, banyak juga yang menyebutnya konstan

        final String application = "Belajar Java"; // constant
//        application = "Belajar Java";
    }
}
