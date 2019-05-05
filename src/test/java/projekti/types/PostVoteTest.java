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
public class PostVoteTest {
    
    public PostVoteTest() {
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
     * Test of getPerson method, of class PostVote.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        PostVote instance = new PostVote();
        Person expResult = null;
        Person result = instance.getPerson();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPost method, of class PostVote.
     */
    @Test
    public void testGetPost() {
        System.out.println("getPost");
        PostVote instance = new PostVote();
        Post expResult = null;
        Post result = instance.getPost();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPerson method, of class PostVote.
     */
    @Test
    public void testSetPerson() {
        System.out.println("setPerson");
        Person person = null;
        PostVote instance = new PostVote();
        instance.setPerson(person);
    }

    /**
     * Test of setPost method, of class PostVote.
     */
    @Test
    public void testSetPost() {
        System.out.println("setPost");
        Post post = null;
        PostVote instance = new PostVote();
        instance.setPost(post);
    }

    /**
     * Test of equals method, of class PostVote.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        PostVote instance = new PostVote();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of canEqual method, of class PostVote.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        PostVote instance = new PostVote();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
    }

}
