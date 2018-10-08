/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan36.targetsaldotabungan;

/*Nama : Cessario Sheva Lakita Purwa Adidjaya
Nim : 1017063
Kelas : IF-2
Deskripsi Program : Menampilkan target saldo berdasarkan (OO)
 */
public class PBO210117063Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldotab = 3500000;
         double bunga = 0.08;
        
        saldo sld = new saldo();
        
        sld.targetSaldo( saldotab, bunga);
    }
    
}
