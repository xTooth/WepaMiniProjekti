/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.types;

import java.time.LocalDateTime;
import java.util.List;
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
public class CommentTest {
    
    public CommentTest() {
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
     * Test of getTime method, of class Comment.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Comment instance = new Comment();
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLikes method, of class Comment.
     */
    @Test
    public void testGetLikes() {
        System.out.println("getLikes");
        Comment instance = new Comment();
        int expResult = 0;
        int result = instance.getLikes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPoster method, of class Comment.
     */
    @Test
    public void testGetPoster() {
        System.out.println("getPoster");
        Comment instance = new Comment();
        Person expResult = null;
        Person result = instance.getPoster();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLikers method, of class Comment.
     */
    @Test
    public void testGetLikers() {
        System.out.println("getLikers");
        Comment instance = new Comment();
        List<Person> expResult = null;
        List<Person> result = instance.getLikers();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPost method, of class Comment.
     */
    @Test
    public void testGetPost() {
        System.out.println("getPost");
        Comment instance = new Comment();
        Post expResult = null;
        Post result = instance.getPost();
        assertEquals(expResult, result);
    }

    /**
     * Test of setText method, of class Comment.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        Comment instance = new Comment();
        instance.setText(text);
    }

    /**
     * Test of setTime method, of class Comment.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        LocalDateTime time = null;
        Comment instance = new Comment();
        instance.setTime(time);
    }

    /**
     * Test of setLikes method, of class Comment.
     */
    @Test
    public void testSetLikes() {
        System.out.println("setLikes");
        int likes = 0;
        Comment instance = new Comment();
        instance.setLikes(likes);
    }

    /**
     * Test of setPoster method, of class Comment.
     */
    @Test
    public void testSetPoster() {
        System.out.println("setPoster");
        Person poster = null;
        Comment instance = new Comment();
        instance.setPoster(poster);
    }

    /**
     * Test of setLikers method, of class Comment.
     */
    @Test
    public void testSetLikers() {
        System.out.println("setLikers");
        List<Person> likers = null;
        Comment instance = new Comment();
        instance.setLikers(likers);
    }

    /**
     * Test of setPost method, of class Comment.
     */
    @Test
    public void testSetPost() {
        System.out.println("setPost");
        Post post = null;
        Comment instance = new Comment();
        instance.setPost(post);
    }

    /**
     * Test of equals method, of class Comment.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Comment instance = new Comment();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of canEqual method, of class Comment.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        Comment instance = new Comment();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
    }
    
}
