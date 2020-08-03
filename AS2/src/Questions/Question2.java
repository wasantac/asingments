/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
import BinaryAlgorithmSearch.BinaryTree;
/**
 *
 * @author walte
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.setRoot(50);
        bt.add(40, 50);
        bt.add(60, 50);
        bt.add(30, 40);
        bt.add(45, 40);

        System.out.println("Checks if the Tree is a SearchBinaryTree");
        System.out.println(bt.testBST());
    }
    
}
