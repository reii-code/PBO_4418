/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportasi;

public class Mobil {
    String warna;
    int merk = Nissan;
    
    public Mobil() {

    }
    
    public Mobil(String color, int brand) {
        this.warna = color;
        this.merk = brand;
    }
    
    public String getwarna() {
        return warna;
    }
    public int getmerk() {
        return merk;
    }
}