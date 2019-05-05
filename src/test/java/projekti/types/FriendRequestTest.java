/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.types;

import java.time.LocalDateTime;
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
public class FriendRequestTest {
    
    public FriendRequestTest() {
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
     * Test of getRecipient method, of class FriendRequest.
     */
    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        FriendRequest instance = new FriendRequest();
        Person expResult = null;
        Person result = instance.getRecipient();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSender method, of class FriendRequest.
     */
    @Test
    public void testGetSender() {
        System.out.println("getSender");
        FriendRequest instance = new FriendRequest();
        Person expResult = null;
        Person result = instance.getSender();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatus method, of class FriendRequest.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        FriendRequest instance = new FriendRequest();
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTime method, of class FriendRequest.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        FriendRequest instance = new FriendRequest();
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRecipient method, of class FriendRequest.
     */
    @Test
    public void testSetRecipient() {
        System.out.println("setRecipient");
        Person recipient = null;
        FriendRequest instance = new FriendRequest();
        instance.setRecipient(recipient);
    }

    /**
     * Test of setSender method, of class FriendRequest.
     */
    @Test
    public void testSetSender() {
        System.out.println("setSender");
        Person sender = null;
        FriendRequest instance = new FriendRequest();
        instance.setSender(sender);
    }

    /**
     * Test of setStatus method, of class FriendRequest.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        int status = 0;
        FriendRequest instance = new FriendRequest();
        instance.setStatus(status);
    }

    /**
     * Test of setTime method, of class FriendRequest.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        LocalDateTime time = null;
        FriendRequest instance = new FriendRequest();
        instance.setTime(time);
    }

    /**
     * Test of equals method, of class FriendRequest.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        FriendRequest instance = new FriendRequest();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of canEqual method, of class FriendRequest.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        FriendRequest instance = new FriendRequest();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
    }

    
}
