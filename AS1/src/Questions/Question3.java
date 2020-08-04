/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import firstassignment.Bag;

/**
 *
 * @author walte
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bag");
        Bag<String> bag = new Bag();
        bag.add("USA");
        bag.add("CANADA");
        bag.add("BRASIL");
        bag.add("USA");
        System.out.println(bag);
        System.out.println(bag.findAll("USA"));
        System.out.println(bag.remove("USA"));
        System.out.println(bag);
        System.out.println(bag.findAll("USA"));
        System.out.println("");
    }
    
}
