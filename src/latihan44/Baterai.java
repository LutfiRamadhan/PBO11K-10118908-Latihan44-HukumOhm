/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan44;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
class Baterai {
    private float kuatArus, hambatan;
   
   public Baterai(float kuatArus, float hambatan){
       this.kuatArus = kuatArus;
       this.hambatan = hambatan;
   }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
        return this.kuatArus*this.hambatan;
    }
    
}
