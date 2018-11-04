/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RADEON
 */
public class Hp {
    private String jenis;
    private int harga;
    private String merk;

    public Hp(String jenis, int harga, String merk) {
        this.jenis = jenis;
        this.harga = harga;
        this.merk = merk;
    }
    
    public int getHarga(){
        return harga;
    }
    public String info(){
        String info = "";
        info += "Jenis Hp : " + this.jenis + "\n";
        info += "Merk Hp : " + this.merk + "\n";
        info += "Harga : " + this.harga + "\n";
        return info;
    }
}
