/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;

import java.util.ArrayList;
import java.util.Iterator;
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
public class BagTest {
    
    public BagTest() {
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
     * Test of size method, of class Bag.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Bag instance = new Bag();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of add method, of class Bag.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = null;
        Bag instance = new Bag();
        boolean expResult = false;
        boolean result = instance.add(element);
        assertEquals(expResult, result);

    }

    /**
     * Test of remove method, of class Bag.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object element = null;
        Bag instance = new Bag();
        Object expResult = null;
        Object result = instance.remove(element);
        assertEquals(expResult, result);

    }

    /**
     * Test of find method, of class Bag.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Object element = null;
        Bag instance = new Bag();
        Object expResult = null;
        Object result = instance.find(element);
        assertEquals(expResult, result);

    }

    /**
     * Test of clear method, of class Bag.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Bag instance = new Bag();
        instance.clear();

    }

    /**
     * Test of iterator method, of class Bag.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Bag instance = new Bag();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Bag.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bag instance = new Bag();
        String expResult = "[]";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of findAll method, of class Bag.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        Object element = null;
        Bag instance = new Bag();
        ArrayList expResult = null;
        ArrayList result = instance.findAll(element);
        assertEquals(expResult, result);

    }
    
}
