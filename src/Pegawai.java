/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RADEON
 */
public class Pegawai {
    private String name;
    private String Pekerjaan;

    public Pegawai(String name, String Pekerjaan) {
        this.name = name;
        this.Pekerjaan = Pekerjaan;
    }
    public String info(){
        String info = "";
        info += "Nama Pegawai : " + this.name + "\n";
        info += "Pekerjaan : " + this.Pekerjaan + "\n";
        return info;
    }
    
}
