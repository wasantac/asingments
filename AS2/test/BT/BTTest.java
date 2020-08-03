/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

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
public class BTTest {
    
    public BTTest() {
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
     * Test of getRoot method, of class BT.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        BT instance = new BT();
        NodeBT expResult = null;
        NodeBT result = instance.getRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setRoot method, of class BT.
     */
    @Test
    public void testSetRoot() {
        System.out.println("setRoot");
        Object root = null;
        BT instance = new BT();
        instance.setRoot(root);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isEmpty method, of class BT.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BT instance = new BT();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of add method, of class BT.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object child = null;
        Object parent = null;
        BT instance = new BT();
        boolean expResult = false;
        boolean result = instance.add(child, parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of SearchNode method, of class BT.
     */
    @Test
    public void testSearchNode() {
        System.out.println("SearchNode");
        Object data = null;
        BT instance = new BT();
        NodeBT expResult = null;
        NodeBT result = instance.SearchNode(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of countLeaves method, of class BT.
     */
    @Test
    public void testCountLeaves() {
        System.out.println("countLeaves");
        BT instance = new BT();
        int expResult = 0;
        int result = instance.countLeaves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isfull method, of class BT.
     */
    @Test
    public void testIsfull() {
        System.out.println("isfull");
        BT instance = new BT();
        boolean expResult = true;
        boolean result = instance.isfull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of height method, of class BT.
     */
    @Test
    public void testHeight() {
        System.out.println("height");
        BT instance = new BT();
        int expResult = 0;
        int result = instance.height();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of preOrder method, of class BT.
     */
    @Test
    public void testPreOrder() {
        System.out.println("preOrder");
        BT instance = new BT();
        instance.preOrder();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of inOrder method, of class BT.
     */
    @Test
    public void testInOrder() {
        System.out.println("inOrder");
        BT instance = new BT();
        instance.inOrder();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of postOrder method, of class BT.
     */
    @Test
    public void testPostOrder() {
        System.out.println("postOrder");
        BT instance = new BT();
        instance.postOrder();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of preOrderNext method, of class BT.
     */
    @Test
    public void testPreOrderNext() {
        System.out.println("preOrderNext");
        Object element = null;
        BT instance = new BT();
        NodeBT expResult = null;
        NodeBT result = instance.preOrderNext(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of inOrderNext method, of class BT.
     */
    @Test
    public void testInOrderNext() {
        System.out.println("inOrderNext");
        Object element = null;
        BT instance = new BT();
        NodeBT expResult = null;
        NodeBT result = instance.inOrderNext(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of postOrderNext method, of class BT.
     */
    @Test
    public void testPostOrderNext() {
        System.out.println("postOrderNext");
        Object element = null;
        BT instance = new BT();
        NodeBT expResult = null;
        NodeBT result = instance.postOrderNext(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
