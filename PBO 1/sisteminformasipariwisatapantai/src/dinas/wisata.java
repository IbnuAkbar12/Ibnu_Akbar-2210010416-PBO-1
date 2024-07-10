/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinas;

/**
 *
 * @author USER
 */
public class wisata extends lokasi {
    
    String namaObjek, layanan, foto;
    int jumlahPengunjung;
    
    public wisata() {}
    
    public wisata(String namaObjek) {
        this.namaObjek = namaObjek;
    }
    
    public wisata(String namaObjek, int jumlahPengunjung) {
        this.namaObjek = namaObjek;
        this.jumlahPengunjung = jumlahPengunjung;
    }
    
    public wisata(String namaObjek, int jumlahPengunjung, String layanan) {
        this.namaObjek = namaObjek;
        this.jumlahPengunjung = jumlahPengunjung;
        this.layanan = layanan;
    }
    
    public wisata(String namaObjek, int jumlahPengunjung, String layanan, String foto) {
        this.namaObjek = namaObjek;
        this.jumlahPengunjung = jumlahPengunjung;
        this.layanan = layanan;
        this.foto = foto;
    }
    
    public wisata(String namaObjek, int jumlahPengunjung, String layanan, String foto, String namaWisata, double latitude, double longitude, String kecamatan, String namaJalan, String noKantor, String deskripsi) {
        super(namaWisata, latitude, longitude, kecamatan, namaJalan, noKantor, deskripsi);
        this.namaObjek = namaObjek;
        this.jumlahPengunjung = jumlahPengunjung;
        this.layanan = layanan;
        this.foto = foto;
    }
    
    // Method input
    public void inputNamaObjek(String namaObjek) {
        this.namaObjek = namaObjek;
    }
    
    public void inputJumlahPengunjung(int jumlahPengunjung) {
        this.jumlahPengunjung = jumlahPengunjung;
    }
    
    public void inputLayanan(String layanan) {
        this.layanan = layanan;
    }
    
    public void inputFoto(String foto) {
        this.foto = foto;
    }
    
    // Method ambil
    public String ambilNamaObjek() {
        return this.namaObjek;
    }
    
    public int ambilJumlahPengunjung() {
        return this.jumlahPengunjung;
    }
    
    public String ambilLayanan() {
        return this.layanan;
    }
    
    public String ambilFoto() {
        return this.foto;
    }
}


