/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import firstassignment.MinStack;

/**
 *
 * @author walte
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("MinStack");
        MinStack<Integer> min = new MinStack<>(((Integer i1,Integer i2) -> i1 - i2));
        min.push(10);
        min.push(3);
        min.push(2);
        min.push(5);
        min.push(1);
        min.push(4);
        System.out.println(min);
        System.out.println(min.getMin());
        min.pop();
        min.pop();
        System.out.println(min);
        System.out.println(min.getMin());
    }
    
}
