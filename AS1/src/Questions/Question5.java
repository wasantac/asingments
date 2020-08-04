/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import doubleNode.DoblyLinkedList;

/**
 *
 * @author walte
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Reverse doblylinkedlist");
        DoblyLinkedList<Integer> db = new DoblyLinkedList<>();       
        db.addLast(1);
        db.addLast(2);
        db.addLast(3);
        db.addLast(4);
        db.addLast(5);  
        System.out.println(db);
        System.out.println(db.reverse());
    }
    
}
