/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleNode;

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
public class DoblyLinkedListTest {
    
    public DoblyLinkedListTest() {
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
     * Test of hashCode method, of class DoblyLinkedList.
     */


    /**
     * Test of addFirst method, of class DoblyLinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object element = null;
        DoblyLinkedList instance = new DoblyLinkedList();
        boolean expResult = false;
        boolean result = instance.addFirst(element);
        assertEquals(expResult, result);

    }

    /**
     * Test of addLast method, of class DoblyLinkedList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object element = null;
        DoblyLinkedList instance = new DoblyLinkedList();
        boolean expResult = false;
        boolean result = instance.addLast(element);
        assertEquals(expResult, result);

    }

    /**
     * Test of removeFirst method, of class DoblyLinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        DoblyLinkedList instance = new DoblyLinkedList();
        boolean expResult = false;
        boolean result = instance.removeFirst();
        assertEquals(expResult, result);

    }

    /**
     * Test of removeLast method, of class DoblyLinkedList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        DoblyLinkedList instance = new DoblyLinkedList();
        boolean expResult = false;
        boolean result = instance.removeLast();
        assertEquals(expResult, result);

    }

    /**
     * Test of getFirst method, of class DoblyLinkedList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        DoblyLinkedList instance = new DoblyLinkedList();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLast method, of class DoblyLinkedList.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        DoblyLinkedList instance = new DoblyLinkedList();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);

    }

    /**
     * Test of size method, of class DoblyLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        DoblyLinkedList instance = new DoblyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of contains method, of class DoblyLinkedList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object element = null;
        DoblyLinkedList instance = new DoblyLinkedList();
        boolean expResult = false;
        boolean result = instance.contains(element);
        assertEquals(expResult, result);

    }

    /**
     * Test of set method, of class DoblyLinkedList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int index = 0;
        Object element = null;
        DoblyLinkedList instance = new DoblyLinkedList();
        boolean expResult = false;
        boolean result = instance.set(index, element);
        assertEquals(expResult, result);

    }

    /**
     * Test of get method, of class DoblyLinkedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        DoblyLinkedList instance = new DoblyLinkedList();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);

    }

    /**
     * Test of isEmpty method, of class DoblyLinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        DoblyLinkedList instance = new DoblyLinkedList();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of insert method, of class DoblyLinkedList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int index = 0;
        Object element = null;
        DoblyLinkedList instance = new DoblyLinkedList();
        boolean expResult = false;
        boolean result = instance.insert(index, element);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class DoblyLinkedList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DoblyLinkedList instance = new DoblyLinkedList();
        String expResult = "[]";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class DoblyLinkedList.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        DoblyLinkedList instance = new DoblyLinkedList();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    /**
     * Test of iterator method, of class DoblyLinkedList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        DoblyLinkedList instance = new DoblyLinkedList();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);

    }

    /**
     * Test of reverse method, of class DoblyLinkedList.
     */
    @Test
    public void testReverse() {
        System.out.println("reverse");
        DoblyLinkedList instance = new DoblyLinkedList();
        DoblyLinkedList expResult = null;
        DoblyLinkedList result = instance.reverse();
        assertEquals(expResult, result);

    }


    
}
