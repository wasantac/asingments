/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryAlgorithmSearch;

import BT.NodeBT;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author walte
 */
public class BinaryTreeTest {
    
    public BinaryTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRoot method, of class BinaryTree.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        BinaryTree instance = new BinaryTree();
        NodeBT expResult = null;
        NodeBT result = instance.getRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setRoot method, of class BinaryTree.
     */
    @Test
    public void testSetRoot() {
        System.out.println("setRoot");
        Object root = null;
        BinaryTree instance = new BinaryTree();
        instance.setRoot(root);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isEmpty method, of class BinaryTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BinaryTree instance = new BinaryTree();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of add method, of class BinaryTree.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object child = null;
        Object parent = null;
        BinaryTree instance = new BinaryTree();
        boolean expResult = false;
        boolean result = instance.add(child, parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of SearchNode method, of class BinaryTree.
     */
    @Test
    public void testSearchNode() {
        System.out.println("SearchNode");
        Object data = null;
        BinaryTree instance = new BinaryTree();
        NodeBT expResult = null;
        NodeBT result = instance.SearchNode(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of countLeaves method, of class BinaryTree.
     */
    @Test
    public void testCountLeaves() {
        System.out.println("countLeaves");
        BinaryTree instance = new BinaryTree();
        int expResult = 0;
        int result = instance.countLeaves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isfull method, of class BinaryTree.
     */
    @Test
    public void testIsfull() {
        System.out.println("isfull");
        BinaryTree instance = new BinaryTree();
        boolean expResult = true;
        boolean result = instance.isfull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of height method, of class BinaryTree.
     */
    @Test
    public void testHeight() {
        System.out.println("height");
        BinaryTree instance = new BinaryTree();
        int expResult = 0;
        int result = instance.height();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of preOrder method, of class BinaryTree.
     */
    @Test
    public void testPreOrder() {
        System.out.println("preOrder");
        BinaryTree instance = new BinaryTree();
        instance.preOrder();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of inOrder method, of class BinaryTree.
     */
    @Test
    public void testInOrder() {
        System.out.println("inOrder");
        BinaryTree instance = new BinaryTree();
        instance.inOrder();
        // TODO review the generated test code and remove the default call to fail.
;
    }

    /**
     * Test of postOrder method, of class BinaryTree.
     */
    @Test
    public void testPostOrder() {
        System.out.println("postOrder");
        BinaryTree instance = new BinaryTree();
        instance.postOrder();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of testBST method, of class BinaryTree.
     */
    @Test
    public void testTestBST() {
        System.out.println("testBST");
        BinaryTree instance = new BinaryTree();
        boolean expResult = true;
        boolean result = instance.testBST();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
