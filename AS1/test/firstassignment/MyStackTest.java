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
public class MyStackTest {
    
    public MyStackTest() {
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
     * Test of push method, of class MyStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = null;
        MyStack instance = new MyStack();
        boolean expResult = false;
        boolean result = instance.push(element);
        assertEquals(expResult, result);

    }

    /**
     * Test of pop method, of class MyStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        MyStack instance = new MyStack();
        boolean expResult = false;
        boolean result = instance.pop();
        assertEquals(expResult, result);

    }

    /**
     * Test of isEmpty method, of class MyStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        MyStack instance = new MyStack();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of getHead method, of class MyStack.
     */
    @Test
    public void testGetHead() {
        System.out.println("getHead");
        MyStack instance = new MyStack();
        Object expResult = null;
        Object result = instance.getHead();
        assertEquals(expResult, result);

    }

    /**
     * Test of setHead method, of class MyStack.
     */
    @Test
    public void testSetHead() {
        System.out.println("setHead");
        Object head = null;
        MyStack instance = new MyStack();
        instance.setHead(head);

    }

    /**
     * Test of toString method, of class MyStack.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MyStack instance = new MyStack();
        String expResult = "[]";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of size method, of class MyStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MyStack instance = new MyStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

    }
    
}
