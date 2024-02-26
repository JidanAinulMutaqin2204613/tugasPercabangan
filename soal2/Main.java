/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan pertama
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = scanner.nextInt();

        // Input operasi aritmatika
        System.out.print("Masukkan operator aritmatika (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        
        // Input bilangan kedua
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = scanner.nextInt();

        // Menggunakan switch case untuk melakukan operasi aritmatika sesuai yang diinput user
        switch (operator) {
            case '+':
                System.out.println("Hasil penjumlahan " + bil1 + " dan " + bil2 + " =  " + (bil1 + bil2));
                break;
            case '-':
                System.out.println("Hasil pengurangan " + bil1 + " dan " + bil2 + " = " + (bil1 - bil2));
                break;
            case '*':
                System.out.println("Hasil perkalian " + bil1 + " dan " + bil2 + " = " + (bil1 * bil2));
                break;
            case '/':
                if (bil2 != 0)
                    System.out.println("Hasil pembagian " + bil1 + " dan " + bil2 + " = " + ((double) bil1 / bil2));
                else
                    System.out.println("Pembagian dengan nol tidak valid.");
                break;
            case '%':
                if (bil2 != 0)
                    System.out.println("Hasil modulo " + bil1 + " dan " + bil2 + " adalah = " + (bil1 % bil2));
                else
                    System.out.println("Modulo dengan nol tidak valid.");
                break;
            default:
                System.out.println("Operator aritmatika tidak valid.");
        }

        scanner.close();
    }
}