 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mutia
 */
public class Main {
    public static void main(String[] args) {
        
        Perpustakaan perpus = new Perpustakaan();
        perpus.tambahBuku("Belajar Java", "Umar Bakhrie");
        perpus.tambahBuku("Java Untuk Pemula", "Amir Mahmud");
        perpus.tambahBuku("Java Untuk Ahli", "Salim Iklim");
        System.out.println("Jumlah Buku: " + perpus.jumlahBuku());
        perpus.tambahBuku("Java Untuk Mahasiswa", "Farid Akbar");
        
        String cari = "pemula";
        System.out.println("Cari Buku : " + cari);
        Buku buku = perpus.cariBuku(cari);
        if(buku == null){
            System.out.println("Buku Tidak Ditemukan! ");
    
        }else{
            System.out.println("Buku ditemukan dengan judul: " + buku.getjudul() + 
                    ", Pengarang: " + buku.getPengarang());
        }
        
        perpus.gantiBuku(0, "Belajar JAVA Baru ", "Umar Bakrie Salim");
        buku = perpus.lihatBuku(0);
        System.out.println("Buku diganti dengan judul: " + buku.getjudul() +
                ", Pengarang: " + buku.getPengarang());
        
        perpus.hapusBuku(0);
        System.out.println("Jumlah Buku: " + perpus.jumlahBuku());
    }
    
}
