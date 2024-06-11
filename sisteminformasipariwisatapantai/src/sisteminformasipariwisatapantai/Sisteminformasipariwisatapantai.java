/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sisteminformasipariwisatapantai;

import dinas.wisata;
import java.util.Scanner;
import CRUD.Koneksi;

/**
 *
 * @author USER
 */
public class Sisteminformasipariwisatapantai {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Koneksi crud = new Koneksi();
        
        crud.hapuswisata(1);
    }
}
