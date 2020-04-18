/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author abiga
 */
public class GoFishAppTest {
    
    public GoFishAppTest() {
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
     * Test of getValue method, of class GoFishApp.
     */
    @Test
    public void testGetValueGood() {
        System.out.println("Good test for getValue()");
        String expResult = "ACE";
        String result = GoFishApp.getValue();
        assertEquals(expResult, result);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetValueBad() {
        System.out.println("Bad test for getValue()");
        String expResult = "ACES";
        String result = GoFishApp.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetValueBoundary() {
        System.out.println("Boundary test for getValue()");
        String expResult = "ace";
        String result = GoFishApp.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
