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
public class Latihan44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai b = new Baterai(3,12);
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar akan berbanding lurus dengan beda potensial pada ujung-ujung kawat penghantar tersebut asalkan suhu kawat dijaga konstan.");
        System.out.println("\nKuat Arus : "+b.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+b.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+b.hitungTegangan());
    }

}
