/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

public class Mobil {
    public static void main(String[] args) {
        MobilL myCar = new MobilL();
        myCar.hidupkanMobil();
        myCar.ubahGigi(1);
        System.out.println("Mobil sudah menyala : " + myCar.active + " Masukan gigi mobil " + myCar.gigi);
    }
}

class Mobill {
    boolean active = false;
    int gigi;

    Mobill() {

    }

    public void hidupkanMobil() {
        active = true;
    }

    public void matikanMobil() {
        active = false;
    }

    public void ubahGigi(int gigiBaru) {
        if (active) {
            gigi = gigiBaru;
        }
    }
}