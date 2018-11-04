/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achmadsatyap
 */
public class Transaksi {
    private Hp hp;
    private Service service;
    private Pegawai pegawai;

    public Transaksi(Hp hp, Service service, Pegawai pegawai) {
        this.hp = hp;
        this.service = service;
        this.pegawai = pegawai;
    }
    
    public int totalBiaya(){
        return service.getHarga() + hp.getHarga();
    }
    public void print(){
        System.out.println(pegawai.info());
        System.out.println(hp.info());
        System.out.println(service.info());
        System.out.println("Total Biaya : " + totalBiaya());
    }
}
