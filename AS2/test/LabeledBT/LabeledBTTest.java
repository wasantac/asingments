/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabeledBT;

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
public class LabeledBTTest {
    
    public LabeledBTTest() {
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
     * Test of PreOrderNumber method, of class LabeledBT.
     */
    @Test
    public void testPreOrderNumber() {
        System.out.println("PreOrderNumber");
        LabeledBT instance = new LabeledBT();
        instance.PreOrderNumber();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of inOrderNumber method, of class LabeledBT.
     */
    @Test
    public void testInOrderNumber() {
        System.out.println("inOrderNumber");
        LabeledBT instance = new LabeledBT();
        instance.inOrderNumber();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of postOrderNumber method, of class LabeledBT.
     */
    @Test
    public void testPostOrderNumber() {
        System.out.println("postOrderNumber");
        LabeledBT instance = new LabeledBT();
        instance.postOrderNumber();
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
