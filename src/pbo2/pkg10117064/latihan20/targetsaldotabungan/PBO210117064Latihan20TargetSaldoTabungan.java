/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan20.targetsaldotabungan;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk memperhitungkan lama 
 * tabungan sampai mencapai saldo target.
 */
public class PBO210117064Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        int saldoTabungan = 3500000;
        double bunga = 0.08;
        double saldoBulanan;
        
        while (saldoTabungan <= 6000000) {
            i = i + 1;
            saldoBulanan = bunga * saldoTabungan;        
            saldoTabungan = (int) (saldoTabungan + saldoBulanan);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldoTabungan);
        }           
    }
    
}
