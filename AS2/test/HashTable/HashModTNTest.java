/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

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
public class HashModTNTest {
    
    public HashModTNTest() {
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
     * Test of insert method, of class HashModTN.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int i = 0;
        HashModTN instance = new HashModTN();
        instance.insert(i);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of remove method, of class HashModTN.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int i = 0;
        HashModTN instance = new HashModTN();
        boolean expResult = false;
        boolean result = instance.remove(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of clear method, of class HashModTN.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        HashModTN instance = new HashModTN();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of contains method, of class HashModTN.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        int i = 0;
        HashModTN instance = new HashModTN();
        boolean expResult = false;
        boolean result = instance.contains(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of get method, of class HashModTN.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        HashModTN instance = new HashModTN();
        int expResult = 0;
        int result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isEmpty method, of class HashModTN.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        HashModTN instance = new HashModTN();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of toString method, of class HashModTN.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HashModTN instance = new HashModTN();
        String expResult = "[]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
