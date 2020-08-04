/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;

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
public class RandomQueueTest {
    
    public RandomQueueTest() {
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
     * Test of add method, of class RandomQueue.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = null;
        RandomQueue instance = new RandomQueue();
        boolean expResult = false;
        boolean result = instance.add(element);
        assertEquals(expResult, result);

    }

    /**
     * Test of remove method, of class RandomQueue.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        RandomQueue instance = new RandomQueue();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);

    }

    /**
     * Test of size method, of class RandomQueue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        RandomQueue instance = new RandomQueue();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class RandomQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RandomQueue instance = new RandomQueue();
        String expResult = "[]";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
