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
public class SimplySwapTest {
    
    public SimplySwapTest() {
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
     * Test of addFirst method, of class SimplySwap.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object element = null;
        SimplySwap instance = new SimplySwap();
        boolean expResult = false;
        boolean result = instance.addFirst(element);
        assertEquals(expResult, result);

    }

    /**
     * Test of addLast method, of class SimplySwap.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object element = null;
        SimplySwap instance = new SimplySwap();
        boolean expResult = false;
        boolean result = instance.addLast(element);
        assertEquals(expResult, result);

    }

    /**
     * Test of removeFirst method, of class SimplySwap.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        SimplySwap instance = new SimplySwap();
        boolean expResult = false;
        boolean result = instance.removeFirst();
        assertEquals(expResult, result);

    }

    /**
     * Test of removeLast method, of class SimplySwap.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        SimplySwap instance = new SimplySwap();
        boolean expResult = false;
        boolean result = instance.removeLast();
        assertEquals(expResult, result);

    }

    /**
     * Test of getFirst method, of class SimplySwap.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        SimplySwap instance = new SimplySwap();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLast method, of class SimplySwap.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        SimplySwap instance = new SimplySwap();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);

    }

    /**
     * Test of size method, of class SimplySwap.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SimplySwap instance = new SimplySwap();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of contains method, of class SimplySwap.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object element = null;
        SimplySwap instance = new SimplySwap();
        boolean expResult = false;
        boolean result = instance.contains(element);
        assertEquals(expResult, result);

    }

    /**
     * Test of set method, of class SimplySwap.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int index = 0;
        Object element = null;
        SimplySwap instance = new SimplySwap();
        boolean expResult = false;
        boolean result = instance.set(index, element);
        assertEquals(expResult, result);

    }

    /**
     * Test of get method, of class SimplySwap.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        SimplySwap instance = new SimplySwap();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);

    }

    /**
     * Test of isEmpty method, of class SimplySwap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SimplySwap instance = new SimplySwap();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of insert method, of class SimplySwap.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int index = 0;
        Object element = null;
        SimplySwap instance = new SimplySwap();
        boolean expResult = false;
        boolean result = instance.insert(index, element);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class SimplySwap.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SimplySwap instance = new SimplySwap();
        String expResult = "[]";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class SimplySwap.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        SimplySwap instance = new SimplySwap();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    /**
     * Test of swap method, of class SimplySwap.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        Object element = null;
        SimplySwap instance = new SimplySwap();
        boolean expResult = false;
        boolean result = instance.swap(element);
        assertEquals(expResult, result);

    }
    
}
