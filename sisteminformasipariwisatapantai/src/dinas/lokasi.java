/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinas;

/**
 *
 * @author USER
 */
public class lokasi {
    
    String namaWisata, kecamatan, namaJalan, noKantor, deskripsi;
    double latitude, longitude;
    
    // Constructor
    public lokasi() {} // Constructor 1
    
    public lokasi(String namaWisata) {
        this.namaWisata = namaWisata;
    } // Constructor 2
    
    public lokasi(String namaWisata, double latitude, double longitude) {
        this.namaWisata = namaWisata;
        this.latitude = latitude;
        this.longitude = longitude;
    } // Constructor 3
    
    public lokasi(String namaWisata, double latitude, double longitude, String kecamatan) {
        this.namaWisata = namaWisata;
        this.latitude = latitude;
        this.longitude = longitude;
        this.kecamatan = kecamatan;
    } // Constructor 4
    
    public lokasi(String namaWisata, double latitude, double longitude, String kecamatan, String namaJalan, String noKantor, String deskripsi) {
        this.namaWisata = namaWisata;
        this.latitude = latitude;
        this.longitude = longitude;
        this.kecamatan = kecamatan;
        this.namaJalan = namaJalan;
        this.noKantor = noKantor;
        this.deskripsi = deskripsi;
    } // Constructor 5
    
    // Method input
    public void inputNamaWisata(String namaWisata) {
        this.namaWisata = namaWisata;
    }
    
    public void inputKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }
    
    public void inputNamaJalan(String namaJalan) {
        this.namaJalan = namaJalan;
    }
    
    public void inputNoKantor(String noKantor) {
        this.noKantor = noKantor;
    }
    
    public void inputDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    // Method ambil
    public String ambilNamaWisata() {
        return this.namaWisata;
    }
    
    public double ambilLatitude() {
        return this.latitude;
    }
    
    public double ambilLongitude() {
        return this.longitude;
    }
    
    public String ambilKecamatan() {
        return this.kecamatan;
    }
    
    public String ambilNamaJalan() {
        return this.namaJalan;
    }
    
    public String ambilNoKantor() {
        return this.noKantor;
    }
    
    public String ambilDeskripsi() {
        return this.deskripsi;
    }
}


