/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import firstassignment.MyStack;
import SimpleNode.SimplyLinkedList;

/**
 *
 * @author walte
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //QUESTION 1A
        SimplyLinkedList<Integer> sl = new SimplyLinkedList<>();
        
        sl.addLast(2);
        sl.addLast(3);
        sl.addLast(1);
        sl.addLast(4);
        sl.addLast(5);
        sl.addLast(6);
        
        System.out.println("deletMin");
        sl.deleteMin((Integer i1,Integer i2) -> i1 - i2);
        System.out.println(sl);
        System.out.println("");
        //QUESTION 1B
        MyStack stack = new MyStack();
        stack.push("1st item");
        stack.push("2nd item");
        stack.push("3rd Item");
        System.out.println("Stack");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
    
}
