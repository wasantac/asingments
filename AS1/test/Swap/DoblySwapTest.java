/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swap;

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
public class DoblySwapTest {
    
    public DoblySwapTest() {
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
     * Test of swap method, of class DoblySwap.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        Object element = null;
        DoblySwap instance = new DoblySwap();
        boolean expResult = false;
        boolean result = instance.swap(element);
        assertEquals(expResult, result);

    }
    
}
