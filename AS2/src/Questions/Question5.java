/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import LabeledBT.LabeledBT;

/**
 *
 * @author walte
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LabeledBT<Integer> bt = new LabeledBT<>();
        bt.setRoot(1);
        bt.add(2, 1);
        bt.add(3, 1);
        bt.add(4, 2);
        bt.add(5, 2);
        bt.add(6, 3);
        bt.add(10, 3);
        bt.PreOrderNumber();
        bt.inOrderNumber();
        bt.postOrderNumber();
        System.out.println("Pre-Order");
        bt.preOrder();
        System.out.println("\nIn-Order");
        bt.inOrder();
        System.out.println("\nPost-Order");
        bt.postOrder();
        System.out.println("");
    }
    
}
