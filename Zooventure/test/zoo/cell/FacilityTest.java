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
public class FacilityTest {
    
    public FacilityTest() {
    }
    /**
     * Test of Interact method, of class Facility.
     */
    @Test
    public void testInteract() {
        System.out.println("Interact");
        Facility X= new Facility('P');
        Facility Y= new Facility('R');
        X.Interact();
        Y.Interact();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
