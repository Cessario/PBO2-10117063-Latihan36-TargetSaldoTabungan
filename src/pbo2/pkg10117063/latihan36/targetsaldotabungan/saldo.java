/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan36.targetsaldotabungan;

/*Nama : Cessario Sheva Lakita Purwa Adidjaya
Nim : 1017063
Kelas : IF-2
Deskripsi Program : Menghitung saldo berdasarkan (OO)
 */
public class saldo {
         int i = 1;
         
         
         public void targetSaldo(int saldotab, double bunga){
          int saldobul;
           do{
           saldobul = (int) (bunga * saldotab);
           saldotab =  (saldotab + saldobul);
              System.out.println("Saldo di bulan ke- "+i + " Rp." + saldotab );
          i++;
            
       }while(saldotab<=6000000);
}
}