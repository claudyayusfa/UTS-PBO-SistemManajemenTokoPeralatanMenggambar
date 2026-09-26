package main;

import java.util.Scanner;
import model.AlatGambar;
import model.AlatGambarKonvensional;
import model.AlatGambarDigital;

/**
 *
 * @author LENOVO
 */
public class SistemManajemenTokoPeralatanMenggambar {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        AlatGambar[] alatKonvensional = {
            new AlatGambarKonvensional(
                    "K001", "Pensil 2B", 2500, 120, "Pensil", "Kayu"
            ),
            new AlatGambarKonvensional(
                    "K002", "Pensil Warna Faber Castell (24)", 68000, 52, "Pensil Warna", "Kayu" 
            ),
            new AlatGambarKonvensional(
                    "K003", "Drawing Pen 0.5", 12000, 37, "Drawing Pen", "Plastik"
            ),
            new AlatGambarKonvensional(
                    "K004", "Kuas Lukis", 15000, 56, "Kuas", "Bulu Sintetis"
            ),
            new AlatGambarKonvensional(
                    "K005", "Cat Air (12 pcs)", 25000, 19, "Cat Air", "Pigmen"
            ),
            new AlatGambarKonvensional(
                    "K006", "Sketchbook A5", 30000, 28, "Sketchbook", "Kertas"
            )
        };
                
        
        AlatGambar[] alatDigital = {
            new AlatGambarDigital(
                    "D001", "Drawing Tablet", 800000, 62, "USB", "Pen Tablet"
            ),
            new AlatGambarDigital(
                    "D002", "Wacom One", 1500000, 4, "USB", "Pen Tablet"
            ),
            new AlatGambarDigital(
                    "D003", "Stylus Pen", 350000, 8, "Bluetooth", "Stylus"
            ),
            new AlatGambarDigital(
                    "D004", "Digital Pen", 250000, 10, "Bluetooth", "Stylus"
            ),
            new AlatGambarDigital(
                    "D005", "Pen Display", 3500000, 3, "USB-C", "Display Tablet"
            ),
            new AlatGambarDigital(
                    "D006", "XP-Pen Deco", 850000, 6, "USB", "Pen Tablet"
            ),
        };
        
        do {
        
            System.out.println("\n===================================");
            System.out.println("    Daftar Peralatan Menggambar");
            System.out.println("===================================");
            System.out.println("1. Lihat Alat Gambar Konvensional");
            System.out.println("2. Lihat Alat Gambar Digital");
            System.out.println("3. Keluar");
            System.out.println("===================================");
            System.out.println("Pilih Menu (1-3): ");

            if (input.hasNextInt()) {
                
                pilihan = input.nextInt();

                switch(pilihan) {

                    case 1:
                        System.out.println("\n === DATA ALAT GAMBAR KONVENSIONAL ===");

                        for (AlatGambar alat : alatKonvensional){
                            alat.tampilkanInfo();
                        }

                        break;

                    case 2:
                        System.out.println("\n === DATA ALAT GAMBAR DIGITAL ===");

                        for (AlatGambar alat : alatDigital){
                            alat.tampilkanInfo();
                        }

                        break;

                    case 3:
                        System.out.println("\nProgram selesai. Terima kasih sudah menggunakan!");
                        break;

                    default:
                        System.out.println("\nPilihan tidak tersedia.");
                }
            } else {
                System.out.println("\nInput harus berupa angka!");
                
                input.next();
                pilihan = 0;
            }      
        } while (pilihan != 3);
        
        input.close();
            
    } 
}
