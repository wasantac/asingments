/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;

import java.util.Comparator;
import java.util.LinkedList;
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
public class MinStackTest {
    
    public MinStackTest() {
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
     * Test of push method, of class MinStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = null;
        MinStack instance = new MinStack(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        boolean expResult = false;
        boolean result = instance.push(element);
        assertEquals(expResult, result);

    }

    /**
     * Test of pop method, of class MinStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        MinStack instance = new MinStack(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        boolean expResult = false;
        boolean result = instance.pop();
        assertEquals(expResult, result);

    }

    /**
     * Test of size method, of class MinStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MinStack instance = new MinStack(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMin method, of class MinStack.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        MinStack instance = new MinStack(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        Object expResult = null;
        Object result = instance.getMin();
        assertEquals(expResult, result);

    }

    /**
     * Test of getStack method, of class MinStack.
     */
    @Test
    public void testGetStack() {
        System.out.println("getStack");
        MinStack instance = new MinStack(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        LinkedList expResult = null;
        LinkedList result = instance.getStack();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class MinStack.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MinStack instance = new MinStack(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        String expResult = "[]";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
