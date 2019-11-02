/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan51.gajikarwayan;

/**
 *
 * @author LENOVO
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    public float tunjanganKehadiran(int hadir){
        tunjanganKehadiran = kehadiran*10000;
        return tunjanganKehadiran;
        
    }
    public float tunjanganJabatan(String jabatan){
        switch(jabatan){
            case "Manager" : tunjanganJabatan = 2000000;
            break;
            default: tunjanganJabatan = 1000000;
            break;      
        }
        return tunjanganJabatan;    
    } 
    public float tunjanganGolongan(int golongan){
        switch(golongan){
            case 1 : tunjanganGolongan = 500000;
            break;
            case 2 : tunjanganGolongan = 1000000;
            break;
            case 3 : tunjanganGolongan = 1500000;
            break;
            default: tunjanganGolongan = 0;
        }
        return tunjanganGolongan;
        
    }
    public float gajiTotal(){
        return (float) tunjanganJabatan+tunjanganGolongan+tunjanganKehadiran;
        
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
}
