/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

/**

public class MotorVehicle extends Vehicle {
    int sizeofEngine = 1;
    String licencePlate = "AB 27 IF";
    
    
    public MotorVehicle(){
    }
    MotorVehicle(int sizeofEngine, String licensePlate) {
        this.sizeofEngine = sizeofEngine;
        this.licencePlate = licencePlate;
    }
    public int getSizeofEngine (){
        return this.sizeofEngine;
    }
    public String getLicencePlate(){
        return this.licencePlate;
    }
    
}
