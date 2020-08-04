/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import firstassignment.RandomQueue;

/**
 *
 * @author walte
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("RandomQueue");
        RandomQueue<String> rq = new RandomQueue<>();
        rq.add("1");
        rq.add("2");
        rq.add("3");
        rq.add("4");
        System.out.println(rq);
        System.out.println(rq.remove());
        System.out.println(rq);
    }
    
}
