/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.types;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Toothy
 */
public class FileObjectTest {
    
    public FileObjectTest() {
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
     * Test of getImage method, of class FileObject.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        FileObject instance = new FileObject();
        byte[] expResult = null;
        byte[] result = instance.getImage();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setImage method, of class FileObject.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        byte[] image = null;
        FileObject instance = new FileObject();
        instance.setImage(image);
    }

    /**
     * Test of equals method, of class FileObject.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        FileObject instance = new FileObject();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of canEqual method, of class FileObject.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        FileObject instance = new FileObject();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
    }

    
}
