/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ass1_1;

/**
 *
 * @author Dell
 */
public class Rectangle extends Shape {
    public int length;
    public int width;
    
    @Override
    public double getArea(){
        length = 10;
        width = 5;
        return length * width;
    }
    
    @Override
    public String toString(){
        return "The area of Rectagle is: " + getArea();
    }
}
