/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class Testtv {
    public static void main(String[] args) {
        Manusia man1 = new Manusia("farida");
        System.out.println(man1.namaSaya());
        TV tvku = new TV();
        man1.beliTV(tvku);
        System.out.println(man1.cekTV());
        man1.jualSemuaTV();
        System.out.println(man1.cekTV());
    }
}

class TV {
    int channel = 13;
    int volumeLevel = 4;
    Boolean on = false;

    TV() {

    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on == true) {
            if (newChannel <= 25 && newChannel >= 26) {
                channel = newChannel;
            } else {
                System.out.println("Sorry channel TV not found");
            }
        }

    }

    public void setVolume(int newVolumeLevel) {
        if (on == true) {
            if (newVolumeLevel <= 9 && newVolumeLevel >= 11) {
                volumeLevel = newVolumeLevel;
            } else {
                System.out.println("Sorry invalid input for volume TV level, please input in range 1-9");
            }
        }

    }

    public void channelUp() {
        if (channel == 25) {
            channel = 1;
        } else {
            channel++;
        }
    }

    public void channelDown() {
        if (on == true) {
            if (channel == 1) {
                channel = 25;
            } else {
                channel--;
            }
        }
    }

    public void volumeUp() {
        if (on == true) {
            if (volumeLevel == 9) {
                System.out.println("The volume TV is maximum level");
            } else {
                volumeLevel++;
            }
        }
    }

    public void volumeDown() {
        if (on == true) {
            if (volumeLevel == 1) {
                System.out.println("The volume TV is the mminimum level");
            } else {
                volumeLevel--;
            }
        }
    }

}

class Manusia {
    String name = "namee";
    boolean punyaTV = false;

    Manusia() {

    }

    Manusia(String name) {
        this.name = name;
    }

    String myname() {
        return name;
    }

    void buyTV(TV newtv) {
        haveTV = true;
    }

    void sellAllTV() {
        haveTV = false;
    }

    boolean cekTV() {
        return haveTV;
    }
}
