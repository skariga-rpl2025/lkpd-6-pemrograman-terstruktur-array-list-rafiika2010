/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Lab Studio
 */
public class MainDataMahasiswa {
    
    public static void main(String[] args) {
        
        DataMahasiswa dataM = new DataMahasiswa();
        
        dataM.tambahMahasiswa("121", "Rafi", "Malang");
        dataM.tambahMahasiswa("122", "Surya", "Sidoarjo");
        dataM.tambahMahasiswa("123", "Prayoga", "Jayapura");
        dataM.tambahMahasiswa("124", "Windah", "Bali");
        dataM.tambahMahasiswa("125", "Satria", "Yogyakarta");
        System.out.println("Jumlah Mahasiswa: " + dataM.jumlahMahasiswa());
        dataM.tambahMahasiswa("126", "Boby", "Tlogomas");
        
        String cari = "126";
        System.out.println("Cari Mahasiswa dengan Npm: " + cari);
        Mahasiswa mahas = dataM.cariMahasiswa(cari);
        if(mahas == null){
            System.out.println("Mahasiswa Tidak Ditemukan! ");
    
        }else{
            System.out.println("Mahasiswa ditemukan dengan Npm: " + mahas.getNpm() + 
                    ", Nama: " + mahas.getNama() + ", Alamat: " + mahas.getAlamat());
        }
        
        dataM.gantiMahasiswa(0, "126", "b", "Sidoarjo");
        mahas = dataM.lihatMahasiswa(0);
        System.out.println("Mahasiswa diganti dengan Npm: " + mahas.getNpm() +
                ", Nama: " + mahas.getNama() + ", Alamat: " + mahas.getAlamat());
        
        dataM.hapusMahasiswa(0);
        System.out.println("Jumlah Mahasiswa: " + dataM.jumlahMahasiswa());
    }
}