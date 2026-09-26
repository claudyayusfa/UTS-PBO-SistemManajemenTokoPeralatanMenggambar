package model;

/**
 *
 * @author LENOVO
 */
public class AlatGambar {
    protected String kode;
    protected String nama;
    protected double harga;
    protected int stok;
    
    //constructor
    public AlatGambar(String kode, String nama, double harga, int stok){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    public String getKode(){
        return kode;
    }
    
    public String getNama(){
        return nama;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public int getStok(){
        return stok;
    }
    
    public void tampilkanInfo(){
        System.out.println("Kode    :" + kode);
        System.out.println("Nama    : " + nama);
        System.out.println("Harga   : Rp" + harga);
        System.out.println("Stok    : " + stok);
    }
}
