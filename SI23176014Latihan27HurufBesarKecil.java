/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176014.latihan27.hurufbesarkecil;

/**
 *
 * @author User
 * NAMA     : Muhammad Nur Khikam
 * KELAS    : Sistem Informasi
 * NIM      : 23176014
 * Deskripsi Program : program ini berisi untuk menampilkan formatting kalimat menjadi huruf besar dan kecil dimana user menginputkan sendiri kalimat nya
 */
import java.util.Scanner;

public class SI23176014Latihan27HurufBesarKecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();

        System.out.println("Huruf Besar: " + hurufBesar);
        System.out.println("Huruf Kecil: " + hurufKecil);
    }
}
