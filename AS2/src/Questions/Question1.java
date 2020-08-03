/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import BT.BT;

/**
 *
 * @author walte
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BT<Integer> bt = new BT<>();
        bt.setRoot(1);
        bt.add(2, 1);
        bt.add(3, 1);
        bt.add(4, 2);
        bt.add(5, 2);
        bt.add(6, 3);
        bt.add(10, 3);
        
        int pre = 6;
        int in = 4;
        int post = 2;
        bt.preOrder();
        System.out.println("Checks the next number after " + pre + " in PreOrder:");
        System.out.println(bt.preOrderNext(pre));
        
        System.out.println("");
        bt.inOrder();
        System.out.println("Checks the next number after "+ in + " in InOrder:");
        System.out.println(bt.inOrderNext(in));
        
        
        System.out.println("");
        bt.postOrder();
        System.out.println("Checks the next number after " + post + " in PostOrder:");
        System.out.println(bt.postOrderNext(post));

    }
    
}
