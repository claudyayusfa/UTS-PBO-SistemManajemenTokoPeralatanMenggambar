package model;

/**
 *
 * @author LENOVO
 */
public class AlatGambarKonvensional extends AlatGambar{
    private String jenis;
    private String bahan;
    
    public AlatGambarKonvensional(String kode, String nama, double harga, int stok, String jenis, String bahan){
        super(kode, nama, harga, stok);
        this.jenis = jenis;
        this.bahan = bahan;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public String getBahan(){
        return bahan;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public void setBahan(String bahan){
        this.bahan = bahan;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.println("+---------------------------------+");
        System.out.println("    Alat Gambar Konvensional");
        super.tampilkanInfo();
        System.out.println("Jenis   : " + jenis);
        System.out.println("Bahan   : " + bahan);
    }
}
