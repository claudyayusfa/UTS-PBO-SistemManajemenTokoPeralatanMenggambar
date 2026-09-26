package model;

/**
 *
 * @author LENOVO
 */
public class AlatGambarDigital extends AlatGambar{
    private String koneksi;
    private String tipe;
    
    public AlatGambarDigital(String kode, String nama, double harga, int stok, String koneksi, String tipe){
        super(kode, nama, harga, stok);
        this.koneksi = koneksi;
        this.tipe = tipe;
    }
    
    public String getKoneksi(){
        return koneksi;
    }
    
    public String getTipe(){
        return tipe;
    }
    
    public void setKoneksi(String koneksi){
        this.koneksi = koneksi;
    }
    
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.println("+---------------------------------+");
        System.out.println("        Alat Gambar Digital");
        super.tampilkanInfo();
        System.out.println("Koneksi : " + koneksi);
        System.out.println("Tipe    : " + tipe);
    }
}
