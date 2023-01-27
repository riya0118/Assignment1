/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ass1_1;

/**
 *
 * @author Dell
 */
public class Triangle extends Shape {
    public int base;
    public int height;
    
    @Override
    public double getArea(){
        base = 10;
        height = 5;
        return 0.5 * base * height;
    }
    
    @Override
    public String toString(){
        return "The area of Triangle is: " + getArea();
    }
}
