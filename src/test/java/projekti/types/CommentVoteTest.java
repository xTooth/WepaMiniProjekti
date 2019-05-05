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
public class CommentVoteTest {
    
    public CommentVoteTest() {
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
     * Test of getPerson method, of class CommentVote.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        CommentVote instance = new CommentVote();
        Person expResult = null;
        Person result = instance.getPerson();
        assertEquals(expResult, result);
    }

    /**
     * Test of getComment method, of class CommentVote.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        CommentVote instance = new CommentVote();
        Comment expResult = null;
        Comment result = instance.getComment();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPerson method, of class CommentVote.
     */
    @Test
    public void testSetPerson() {
        System.out.println("setPerson");
        Person person = null;
        CommentVote instance = new CommentVote();
        instance.setPerson(person);
    }

    /**
     * Test of setComment method, of class CommentVote.
     */
    @Test
    public void testSetComment() {
        System.out.println("setComment");
        Comment comment = null;
        CommentVote instance = new CommentVote();
        instance.setComment(comment);
    }

    /**
     * Test of equals method, of class CommentVote.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        CommentVote instance = new CommentVote();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);

    }

    /**
     * Test of canEqual method, of class CommentVote.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        CommentVote instance = new CommentVote();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
    }




    
}
