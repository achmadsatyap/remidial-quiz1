/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achmadsatyap
 */
public class Main {
    public static void main(String[] args) {
        Service servis = new Service("servis hp", 25000);
        Hp hp = new Hp("Android", 20000, "Samsung");
        Pegawai pegawai = new Pegawai("Agus", "CS");
        Transaksi transaksi = new Transaksi(hp, servis, pegawai);
        
        transaksi.print();
    }
}
