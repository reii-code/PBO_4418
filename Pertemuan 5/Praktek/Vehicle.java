/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestKendaraan;

public class Vehicle {
    double speed = 2;
    String color = "white";
    
    public Vehicle(){
    }
    
    public void goStraight(){
        System.out.println("Maju");
    }
        
    public void turnLeft(){
        System.out.println("Ke Kiri");
    }
        
    public void turnRight(){
        System.out.println("Ke Kanan");
    }
        
    
    
    
}