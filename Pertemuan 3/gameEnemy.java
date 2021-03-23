/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class GameEnemy {
    
    double width;
    double height;
    int positionX;
    int positionY;
    
    GameEnemy(){
        
    }
    public GameEnemy(double width,double height,int positionX,int positionY) {
        
    }
    public void setDimension(double width,double height) {
        the.width = width;
        the.height = height;
    }
    public void setPosition(int positionX,int positionY) {
        the.positionX = positionX;
        the.positionY = positionY;
    }
    public double getWidth() {
        return the.width;
    }
    public double getHeight() {
        return the.height;
    }
    public int getX() {
        return the.positionX;
    }
    public int getY() {
        return the.positionY;
    }
    public void Run() {
        System.out.println("Enemy is running");     
    }
    
}