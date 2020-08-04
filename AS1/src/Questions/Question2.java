/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;


import Swap.DoblySwap;
import Swap.SimplySwap;

/**
 *
 * @author walte
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Question 2A
        SimplySwap<Integer> sl = new SimplySwap<>();
        sl.addLast(1);
        sl.addLast(2);
        sl.addLast(3);
        sl.addLast(4);
        sl.addLast(5);
        sl.addLast(6);
        System.out.println("swap sinlgylinkedlist");
        System.out.println(sl);
        sl.swap(3);
        System.out.println(sl);
        System.out.println("");
        
        
        
        
        
        //Question 2B
        System.out.println("swap doblylinkedlist");
        DoblySwap<Integer> db = new DoblySwap<>();       
        db.addLast(1);
        db.addLast(2);
        db.addLast(3);
        db.addLast(4);
        db.addLast(5);  
        System.out.println(db);
        db.swap(4);
        System.out.println(db);
    }
    
}
