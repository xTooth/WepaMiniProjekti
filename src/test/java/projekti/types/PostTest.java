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
public class PostTest {
    
    public PostTest() {
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
     * Test of getText method, of class Post.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Post instance = new Post();
        String result = instance.getText();
        assertEquals(null, result);
    }

    /**
     * Test of getTime method, of class Post.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Post instance = new Post();
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLikes method, of class Post.
     */
    @Test
    public void testGetLikes() {
        System.out.println("getLikes");
        Post instance = new Post();
        int expResult = 0;
        int result = instance.getLikes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLikers method, of class Post.
     */
    @Test
    public void testGetLikers() {
        System.out.println("getLikers");
        Post instance = new Post();
        List<Person> expResult = null;
        List<Person> result = instance.getLikers();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPoster method, of class Post.
     */
    @Test
    public void testGetPoster() {
        System.out.println("getPoster");
        Post instance = new Post();
        Person expResult = null;
        Person result = instance.getPoster();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImage method, of class Post.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Post instance = new Post();
        FileObject expResult = null;
        FileObject result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getComments method, of class Post.
     */
    @Test
    public void testGetComments() {
        System.out.println("getComments");
        Post instance = new Post();
        List<Comment> expResult = null;
        List<Comment> result = instance.getComments();
        assertEquals(expResult, result);
    }

    /**
     * Test of setText method, of class Post.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        Post instance = new Post();
        instance.setText(text);
    }

    /**
     * Test of setTime method, of class Post.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        LocalDateTime time = null;
        Post instance = new Post();
        instance.setTime(time);
    }

    /**
     * Test of setLikes method, of class Post.
     */
    @Test
    public void testSetLikes() {
        System.out.println("setLikes");
        int likes = 0;
        Post instance = new Post();
        instance.setLikes(likes);
    }

    /**
     * Test of setLikers method, of class Post.
     */
    @Test
    public void testSetLikers() {
        System.out.println("setLikers");
        List<Person> likers = null;
        Post instance = new Post();
        instance.setLikers(likers);
    }

    /**
     * Test of setPoster method, of class Post.
     */
    @Test
    public void testSetPoster() {
        System.out.println("setPoster");
        Person poster = null;
        Post instance = new Post();
        instance.setPoster(poster);
    }

    /**
     * Test of setImage method, of class Post.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        FileObject image = null;
        Post instance = new Post();
        instance.setImage(image);
    }

    /**
     * Test of setComments method, of class Post.
     */
    @Test
    public void testSetComments() {
        System.out.println("setComments");
        List<Comment> comments = null;
        Post instance = new Post();
        instance.setComments(comments);
    }

    /**
     * Test of equals method, of class Post.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Post instance = new Post();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of canEqual method, of class Post.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        Post instance = new Post();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
    }
    
}
