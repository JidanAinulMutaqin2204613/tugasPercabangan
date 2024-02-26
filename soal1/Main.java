/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input bilangan riil
        System.out.print("Masukkan sebuah bilangan ril: ");
        double bilangan = input.nextDouble();
        
        // validasi bilangan riil
        if (bilangan > 0) {
            int angkaDepanKoma;
            double angkaBelakangKoma;
            
            // Memeriksa apakah bilangan memiliki pecahan
            if (bilangan % 1 != 0) {
                String[] parts = String.valueOf(bilangan).split("\\.");
                angkaDepanKoma = Integer.parseInt(parts[0]);
                angkaBelakangKoma = Double.parseDouble("0." + parts[1]);
            } else {
                angkaDepanKoma = (int) bilangan;
                angkaBelakangKoma = bilangan - angkaDepanKoma;
            }
        
            // Memeriksa apakah angka di depan koma merupakan kelipatan 3
            if (angkaDepanKoma % 3 == 0) {
                System.out.println("Angka di depan koma adalah kelipatan 3.");
            } else {
                System.out.println("Angka di depan koma bukan kelipatan 3.");
            }
            // Memeriksa apakah angka di depan koma merupakan kelipatan 3
            if ((int) (angkaBelakangKoma * 100) % 3 == 0) {
                System.out.println("Angka di belakang koma adalah kelipatan 3.");
            } else {
                System.out.println("Angka di belakang koma bukan kelipatan 3.");
            }
            
        } else {
            System.out.println(bilangan + " Bukan bilangan riil");
        }
    }
}

