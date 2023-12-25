package com.learning.java_dasar;

public class _17IfStatment {
    public static void main(String[] args) {
        // if adalah salah satu kata kunci yang digunakan untuk percabangan

        int nilai = 70;
        int absen = 90;

        boolean lulusNilai = nilai >= 75;
        boolean lulusAbsen = absen >= 75;

        boolean lulus = lulusNilai && lulusAbsen;

        if(lulus){
            System.out.println("Anda Lulus");
        }else{
            System.out.println("tidak lulus");
        }

        // else
        // kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
        // hal ini bisa dilakukan menggunakan else expression

        // else if, kadang kita butuh membuat beberapa kondisi
        // kasus seperti ini, di java kita bisa menggunakan else if expression
        // else if di java bisa lebih dari satu

    }
}
