/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan51.gajikarwayan;

import java.util.Scanner;

/**
 * Nama = Tassyakur Pasya
 * Kelas = IF01
 * NIM = 10118009
 * Deskripsi Program = Gaji Karyawan
 * @author LENOVO
 */
public class IF01PBO110118009Latihan51GajiKarwayan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        Manager mgr = new Manager();
        System.out.print("Masukkan NIK : ");
        mgr.setNik(input.nextLine());
        System.out.print("Masukkan Nama : ");
        mgr.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3): ");
        mgr.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag): ");
        mgr.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mgr.setKehadiran(input.nextInt());
     
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK : "+mgr.getNik());
        System.out.println("Nama : "+mgr.getNama());
        System.out.println("Golongan : "+mgr.getGolongan());
        System.out.println("Jabatan : "+mgr.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN :Rp. "+mgr.tunjanganGolongan(mgr.getGolongan()));
        System.out.println("TUNJANGAN JABATAN :Rp. "+mgr.tunjanganJabatan(mgr.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN :Rp. "+mgr.tunjanganKehadiran(mgr.getKehadiran()));
        
        System.out.println("GAJI TOTAL :Rp. "+mgr.gajiTotal());
    }
    
}
