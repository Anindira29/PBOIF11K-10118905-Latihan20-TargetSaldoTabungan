/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan20.targetsaldotabungan;

import java.util.Locale;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina FItriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Target SaldoTabungan
 */
public class PBOIF11K10118905Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo_awal = 3500000;
        int saldo_ahir = saldo_awal;
        int i = 1;
        while (saldo_ahir <= 6000000){
            System.out.println("saldo dibulan ke -".concat(String.valueOf(i++)));
            saldo_ahir += ( saldo_ahir * 8 / 100);
            System.out.println(String.format(Locale.ROOT,"Rp %,3d", saldo_ahir));
            
            
        }
 
    }
    
}
