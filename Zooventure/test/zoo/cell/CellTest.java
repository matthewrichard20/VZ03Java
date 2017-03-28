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
import zoo.animal.Animal;

/**
 *
 * @author RichardMatthew
 */
public class CellTest {
    
    public CellTest() {
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
     * Test of GetAnimal method, of class Cell.
     */
    @Test
    public void testGetAnimal() {
        System.out.println("GetAnimal");
        Cell instance = new Cell();
        Animal expResult = null;
        Animal result = instance.GetAnimal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetAnimal method, of class Cell.
     */
    @Test
    public void testSetAnimal() {
        System.out.println("SetAnimal");
        Animal x = null;
        Cell instance = new Cell();
        instance.SetAnimal(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetHabitat method, of class Cell.
     */
    @Test
    public void testGetHabitat() {
        System.out.println("GetHabitat");
        Cell instance = new Cell();
        char expResult = ' ';
        char result = instance.GetHabitat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsCageAvailable method, of class Cell.
     */
    @Test
    public void testIsCageAvailable() {
        System.out.println("IsCageAvailable");
        Cell instance = new Cell();
        boolean expResult = false;
        boolean result = instance.IsCageAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetCage method, of class Cell.
     */
    @Test
    public void testGetCage() {
        System.out.println("GetCage");
        Cell instance = new Cell();
        Cage expResult = null;
        Cage result = instance.GetCage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Render method, of class Cell.
     */
    @Test
    public void testRender() {
        System.out.println("Render");
        Cell instance = new Cell();
        char expResult = ' ';
        char result = instance.Render();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InitBoolVisited method, of class Cell.
     */
    @Test
    public void testInitBoolVisited() {
        System.out.println("InitBoolVisited");
        Cell instance = new Cell();
        instance.InitBoolVisited();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsVisited method, of class Cell.
     */
    @Test
    public void testIsVisited() {
        System.out.println("IsVisited");
        Cell instance = new Cell();
        boolean expResult = false;
        boolean result = instance.IsVisited();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetBool method, of class Cell.
     */
    @Test
    public void testSetBool() {
        System.out.println("SetBool");
        boolean x = false;
        Cell instance = new Cell();
        instance.SetBool(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetAbsis method, of class Cell.
     */
    @Test
    public void testSetAbsis() {
        System.out.println("SetAbsis");
        int a = 0;
        Cell instance = new Cell();
        instance.SetAbsis(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetOrdinat method, of class Cell.
     */
    @Test
    public void testSetOrdinat() {
        System.out.println("SetOrdinat");
        int b = 0;
        Cell instance = new Cell();
        instance.SetOrdinat(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
