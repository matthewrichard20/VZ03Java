/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.animal;

import java.util.HashSet;
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
public class AnimalTest {
    
    public AnimalTest() {
    }
    /**
     * Test of GetName method, of class Animal.
     */
    @Test
    public void testGetName() {
        System.out.println("GetName");
        Animal instance = new Draco(10);
        String expResult = "Bunglon terbang";
        String result = instance.GetName();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetDiet method, of class Animal.
     */
    @Test
    public void testGetDiet() {
        System.out.println("GetDiet");
        Animal instance = new Giraffe(100);
        DietType expResult = new DietType('H');
        DietType result = instance.GetDiet();
        assertEquals(expResult.GetDietCode(), result.GetDietCode());
    }

    /**
     * Test of GetHabitat method, of class Animal.
     */
    @Test
    public void testGetHabitat() {
        System.out.println("GetHabitat");
        Animal instance = new Lion(2000);
        char[] expResult = new char[2];
        expResult[0]= 'l';
        expResult[1]= '0';
        
        char[] result = instance.GetHabitat();
        /*boolean pass = true;
        for (int i= 0; i<2;i++)
        {
            pass = pass && (expResult[i]==result[i]);
        }*/
        
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of ChangeTame method, of class Animal.
     */
    @Test
    public void testChangeTame() {
        System.out.println("ChangeTame");
        boolean _tame = false;
        Animal instance = new Lion(2000);
        instance.ChangeTame(_tame);
        assertEquals(_tame,instance.tame);
    }

    /**
     * Test of CalculateFood method, of class Animal.
     */
    @Test
    public void testCalculateFood() {
        System.out.println("CalculateFood");
        int w = 2000;
        Animal instance = new Lion(w);
        double expResult = 1300.0;
        double result = instance.CalculateFood();
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of SetX and GetX method, of class Animal.
     */
    @Test
    public void testSetXGetX() {
        System.out.println("SetX");
        Animal instance = new Tiger(2200);
        int x=1;
        instance.SetX(x);
        
        System.out.println("GetX");
        int expResult = x;
        int result = instance.GetX();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of SetY and GetY method, of class Animal.
     */
    @Test
    public void testSetYGetY() {
        System.out.println("SetY");
        Animal instance = new Tiger(2200);
        int y=1;
        instance.SetY(y);
        
        System.out.println("GetY");
        int expResult = y;
        int result = instance.GetY();
        assertEquals(expResult, result);
    }
}
