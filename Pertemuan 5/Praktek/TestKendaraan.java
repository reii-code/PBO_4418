/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujikendaraan;

public class TestKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sepeda = new Bicycle();
        MotorVehicle motor = new MotorVehicle();
        
        System.out.println("...........");
        System.out.println(sepeda.speed);
        System.out.println(sepeda.color);
        sepeda.turnRight();
        sepeda.ringBell();
        
        System.out.println("...........");
        
        System.out.println(motor.speed);
        System.out.println(motor.color);
        System.out.println(motor.licencePlate);
        System.out.println(motor.sizeofEngine);
        motor.turnLeft();
        System.out.println(motor.getLicencePlate());
        System.out.println(motor.getSizeofEngine());
        
        System.out.println("...........");
    }
}

