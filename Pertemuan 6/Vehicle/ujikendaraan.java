/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;


public class UjiKendaraan {
    public static void kendaraanmelaju(Vehicle Vehicle){
        Vehicle.goStraight();
}

    public static void main(String[] args) {
        Bicycle sepeda = new Bicycle();
        MotorVehicle motor = new MotorVehicle();
        motorCycle motor = new motorCycle ();
        Car Mobil = new Car();
        
        kendaraanmelajulaju(new Vehicle());
        kendaraanmelaju(new Bicycle());
        kendaraanmelaju(new MotorVehicle());
        sepeda.ringBell();
        
        transportasi.goStraight();
        transportasi.turnLeft();
        transportasi.turnRight();
        sepedamotor.getSizeofEngine();
        sepedamotor.getLicencePlate();
        sepeda.ringBell();
        motor.setGearFoot(4);
        mobil.setSeatBelt(1);
        
        
        System.out.println("Nomor Sepeda motor: "+sepedamotor.getLicencePlate());
        System.out.println("Mesin motor: "+sepedamotor.getSizeofEngine());
        System.out.println("Gear of motor 4: " + motor.getGearFoot());
        System.out.println(pakai Seatbelt : " + mobil.getSeatBelt());

        
        