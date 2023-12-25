package com.learning.java_dasar;

public class _09TipeDataString {
    public static void main(String[] args) {
        // tipe data string adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks
        // di java, tipe data string direpresentasikan dengan kata kunci string
        // untuk membuat string di java, kita menggunakan karakter " (petik dua) sebelum dan setelah teks nya
        // default value untuk string adalah null

        String firstName = "Andra";
        String lastName = "Wijaya";
        System.out.print(firstName);
        System.out.println(lastName);

        // menggabungkan lebih dari satu string
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
}
