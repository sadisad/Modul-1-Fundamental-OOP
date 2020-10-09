package com.iSad.Modul1.Object;
// class main
public class Objek {
    public static void main(String[] args) {

        // Deklarasi objek tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Fikri");
        mahasiswaTanpa.setNim(19104055);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("NIM\t\t: " + mahasiswaTanpa.getNim());

        // Deklarasi object dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 2090823);
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("NIM\t\t: " + mahasiswa.getNim());
    }
}
