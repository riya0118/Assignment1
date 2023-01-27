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
public class HashSetEx {
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<String>();
        cities.add("Surat");
        cities.add("Ahemedabad");
        cities.add("Rajkot");
        
        for(String i : cities){
            System.out.println(i);
        }
    }
}
