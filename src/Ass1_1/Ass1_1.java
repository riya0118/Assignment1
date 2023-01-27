/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ass1_1;

import static java.lang.System.out;

/**
 *
 * @author Dell
 */

public class Ass1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Upcastring - error
        //Rectangle r1 = new Shape();
        
        Shape s1 = new Rectangle();
        out.println(s1.toString());
        
        Shape s2 = new Triangle();
        out.println(s2.toString());
    }
    
}
