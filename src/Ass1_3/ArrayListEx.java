/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ass1_3;

/**
 *
 * @author Dell
 */
import java.util.*;

public class ArrayListEx {
    public static void main(String[] args){
        ArrayList departments = new ArrayList();
        departments.add("mscit");
        departments.add("mscict");
        
        System.out.println("Student Departmen: " + departments);
        
        ArrayList students = new ArrayList();
        students.add("Riya");
        students.add("Kush");
        students.add("Krish");
        
        System.out.println("Students: " + students);
        System.out.println("Student at index 2: " + students.get(2));
        students.set(1, "Mili");
        System.out.println("Students: " + students);
    }
}
