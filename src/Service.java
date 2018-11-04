/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achmadsatyap
 */
public class Service {
    private String layanan;
    private int harga;

    public Service(String layanan, int harga) {
        this.layanan = layanan;
        this.harga = harga;
    }
    
    public int getHarga(){
        return harga;
    }
    public String info(){
        String info = "";
        info += "Layanan yang diberikan : " + this.layanan + "\n";
        info += "Harga : " + this.harga + "\n";
        return info;
    }
}
