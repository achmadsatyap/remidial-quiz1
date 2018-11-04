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
        Service s = new Service("servis hp", 25000);
        Hp hp = new Hp("Android", 20000, "Samsung");
        Pegawai p = new Pegawai("Agus", "CS");
        Transaksi t = new Transaksi(hp, s, p);
        
        t.print();
    }
}
