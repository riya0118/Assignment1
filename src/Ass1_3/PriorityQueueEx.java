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
public class PriorityQueueEx {
    public static void main(String[] args){
        PriorityQueue<String> students = new PriorityQueue<String>();
        students.add("Riya");
        students.add("Kush");
        students.add("Krish");
        
        System.out.println("Head: " + students.element());
        System.out.println("Head: " + students.peek());
        System.out.println("----------------------------------------------");
        Iterator itr = students.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}
