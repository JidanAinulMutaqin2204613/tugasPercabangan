/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input waktu mulai
        System.out.print("Masukkan jam mulai: ");
        int jamMulai = scanner.nextInt();
        System.out.print("Masukkan menit mulai: ");
        int menitMulai = scanner.nextInt();

        // Input waktu selesai
        System.out.print("Masukkan jam selesai: ");
        int jamSelesai = scanner.nextInt();
        System.out.print("Masukkan menit selesai: ");
        int menitSelesai = scanner.nextInt();

        // Menghitung selisih waktu dalam menit
        int waktuMulai = jamMulai * 60 + menitMulai;
        int waktuSelesai = jamSelesai * 60 + menitSelesai;
        int selisihWaktu = waktuSelesai - waktuMulai;

        // Menghitung lama dalam jam dan menit
        int lamaJam = selisihWaktu / 60;
        int lamaMenit = selisihWaktu % 60;
        
        // Output
        System.out.println("Lama jumlah menitnya adalah: " + selisihWaktu);
        System.out.println("Lama waktu antara jam mulai dan jam selesai adalah: " + lamaJam + " jam dan " + lamaMenit + " menit.");

        scanner.close();
    }
}

