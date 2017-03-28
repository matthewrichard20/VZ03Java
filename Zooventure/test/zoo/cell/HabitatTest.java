/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.cell;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RichardMatthew
 */
public class HabitatTest {
    
    public HabitatTest() {
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
     * Test of IsCage method, of class Habitat.
     */
    @Test
    public void testIsCage() {
        System.out.println("IsCage");
        Habitat instance = null;
        boolean expResult = false;
        boolean result = instance.IsCage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsCageAvailable method, of class Habitat.
     */
    @Test
    public void testIsCageAvailable() {
        System.out.println("IsCageAvailable");
        Habitat instance = null;
        boolean expResult = false;
        boolean result = instance.IsCageAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetCage method, of class Habitat.
     */
    @Test
    public void testGetCage() {
        System.out.println("GetCage");
        Habitat instance = null;
        Cage expResult = null;
        Cage result = instance.GetCage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetHabitat method, of class Habitat.
     */
    @Test
    public void testGetHabitat() {
        System.out.println("GetHabitat");
        Habitat instance = null;
        char expResult = ' ';
        char result = instance.GetHabitat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Render method, of class Habitat.
     */
    @Test
    public void testRender() {
        System.out.println("Render");
        Habitat instance = null;
        char expResult = ' ';
        char result = instance.Render();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
