/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ass1_3;

import java.util.*;

/**
 *
 * @author Dell
 */
public class HashMapEx {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        students.put(1, "Riya");
        students.put(2, "Kush");
        students.put(3, "Krish");
        
        for(int key : students.keySet()){
            System.out.println("Rollno: " + key + " Name: " + students.get(key));
        }
    }
}
