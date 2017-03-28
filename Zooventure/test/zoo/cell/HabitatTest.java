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
import zoo.animal.Eagle;

/**
 *
 * @author RichardMatthew
 */
public class HabitatTest {
    
    public HabitatTest() {
    }

    /**
     * Test of IsCage method, of class Habitat.
     */
    @Test
    public void testIsCage() {
        System.out.println("IsCage");
        
        boolean expResult = true;
        boolean result = true;
        Habitat instance = new Habitat('L');
        if (instance.IsCage())
        {
            System.out.println("Can detect IsCage = true");
            result = result && true;
        } else {
            System.out.println("Can't detect IsCage = true");
            result = result && false;
        }
        
        Habitat instance2 = new Habitat('a');
        if (!instance2.IsCage())
        {
            System.out.println("Can detect IsCage = false");
            result = result && true;
        } else {
            System.out.println("Can't detect IsCage = false");
            result = result && false;
        }
        if (result){
            System.out.println("IsCage passed the test");
        }
        else
        {
            System.out.println("IsCage didn't passed the test");
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of IsCageAvailable method, of class Habitat.
     */
    @Test
    public void testIsCageAvailable() {
        System.out.println("IsCageAvailable");
        boolean expResult = true;
        boolean result = true;
        Habitat instance = new Habitat('L');
        if (instance.IsCageAvailable())
        {
            System.out.println("Can detect IsCageAvailable = true");
            result = result && true;
        } else {
            System.out.println("Can't detect IsCageAvailable = true");
            result = result && false;
        }
        
        Habitat instance2 = new Habitat('A');
        Animal a = new Eagle(200);
        instance2.SetAnimal(a);
        if (!instance2.IsCageAvailable())
        {
            System.out.println("Can detect IsCageAvailable = false");
            result = result && true;
        } else {
            System.out.println("Can't detect IsCageAvailable = false");
            result = result && false;
        }
        if (result){
            System.out.println("IsCageAvailable passed the test");
        }
        else
        {
            System.out.println("IsCageAvailable didn't passed the test");
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of GetCage method, of class Habitat.
     */
    @Test
    public void testGetCage() {
        System.out.println("GetCage");
        Habitat instance = new Habitat('L');
        Cage expResult = null;
        Cage result = instance.GetCage();
        if (result != expResult){
            System.out.println("Can GetCage");
            assert(true);
        }
        else{
            System.out.println("Can't GetCage");
            assert(false);
        }
        
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
