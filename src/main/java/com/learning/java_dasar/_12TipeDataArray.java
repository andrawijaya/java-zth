package com.learning.java_dasar;

public class _12TipeDataArray {
    public static void main(String[] args) {
        // array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
        // jumlah data di array tidak bisa berubah setelah pertama kali dibuat

        // membuat variable dengan tipe array
        String[] arrayString;

        // membuat data array
        arrayString = new String[3];
        arrayString[0] = "Andra";
        arrayString[1] = "Wijaya";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);

        arrayString[0] = "Budo";
        System.out.println(arrayString[0]);

        // array initializer
        // membuat array dan langsung mengisi nilai2 nya
        String[] namaNama = new String[]{
                "Andra", "Wijaya"
        };

        int[] arrayInt = {
                10, 90, 80, 67, 29
        };

        Long[] arraLong = new Long[]{
                10L, 20L
        };

        System.out.println(arraLong.length);

        // di array tidak ada penghapusan data
        namaNama[0] = null;

        String[][] members = {
                {"Eko", "Kurniawan"},
                {"Budi", "Nugraha"},
                {"Joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1]);

    }
}
