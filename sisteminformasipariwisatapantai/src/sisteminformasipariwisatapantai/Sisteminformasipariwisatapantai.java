/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sisteminformasipariwisatapantai;

import dinas.wisata;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Sisteminformasipariwisatapantai {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Buat objek wisata
        wisata wisata1 = new wisata();
        
        // Input manual untuk objek wisata
        System.out.print("Masukkan Nama Objek: ");
        wisata1.inputNamaObjek(scanner.nextLine());
        
        System.out.print("Masukkan Jumlah Pengunjung: ");
        wisata1.inputJumlahPengunjung(scanner.nextInt());
        scanner.nextLine(); // Consume newline
        
        System.out.print("Masukkan Layanan: ");
        wisata1.inputLayanan(scanner.nextLine());
        
        System.out.print("Masukkan Foto: ");
        wisata1.inputFoto(scanner.nextLine());
        
        System.out.print("Masukkan Nama Wisata: ");
        wisata1.inputNamaWisata(scanner.nextLine());
        
        System.out.print("Masukkan Kecamatan: ");
        wisata1.inputKecamatan(scanner.nextLine());
        
        System.out.print("Masukkan Nama Jalan: ");
        wisata1.inputNamaJalan(scanner.nextLine());
        
        System.out.print("Masukkan No Kantor: ");
        wisata1.inputNoKantor(scanner.nextLine());
        
        System.out.print("Masukkan Deskripsi: ");
        wisata1.inputDeskripsi(scanner.nextLine());
        
        // Output informasi objek wisata
        System.out.println("Nama Objek: " + wisata1.ambilNamaObjek());
        System.out.println("Jumlah Pengunjung: " + wisata1.ambilJumlahPengunjung());
        System.out.println("Layanan: " + wisata1.ambilLayanan());
        System.out.println("Foto: " + wisata1.ambilFoto());
        System.out.println("Lokasi Nama Wisata: " + wisata1.ambilNamaWisata());
        System.out.println("Kecamatan: " + wisata1.ambilKecamatan());
        System.out.println("Nama Jalan: " + wisata1.ambilNamaJalan());
        System.out.println("No Kantor: " + wisata1.ambilNoKantor());
        System.out.println("Deskripsi: " + wisata1.ambilDeskripsi());
    }
}
