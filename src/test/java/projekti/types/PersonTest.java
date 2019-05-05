/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.types;

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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new Person();
        String result = instance.getName();
        assertEquals(null, result);
    }

    /**
     * Test of getUsername method, of class Person.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Person instance = new Person();
        String result = instance.getUsername();
        assertEquals(null, result);
    }

    /**
     * Test of getPassword method, of class Person.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Person instance = new Person();
        String result = instance.getPassword();
        assertEquals(null, result);
    }

    /**
     * Test of getCustomURL method, of class Person.
     */
    @Test
    public void testGetCustomURL() {
        System.out.println("getCustomURL");
        Person instance = new Person();
        String result = instance.getCustomURL();
        assertEquals(null, result);
    }

    /**
     * Test of getProfilepic method, of class Person.
     */
    @Test
    public void testGetProfilepic() {
        System.out.println("getProfilepic");
        Person instance = new Person();
        FileObject expResult = null;
        FileObject result = instance.getProfilepic();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFriends method, of class Person.
     */
    @Test
    public void testGetFriends() {
        System.out.println("getFriends");
        Person instance = new Person();
        List<Person> expResult = null;
        List<Person> result = instance.getFriends();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFriendsRequests method, of class Person.
     */
    @Test
    public void testGetFriendsRequests() {
        System.out.println("getFriendsRequests");
        Person instance = new Person();
        List<Person> expResult = null;
        List<Person> result = instance.getFriendsRequests();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBlocked method, of class Person.
     */
    @Test
    public void testGetBlocked() {
        System.out.println("getBlocked");
        Person instance = new Person();
        List<Person> expResult = null;
        List<Person> result = instance.getBlocked();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPosts method, of class Person.
     */
    @Test
    public void testGetPosts() {
        System.out.println("getPosts");
        Person instance = new Person();
        List<Post> expResult = null;
        List<Post> result = instance.getPosts();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Person instance = new Person();
        instance.setName(name);
    }

    /**
     * Test of setUsername method, of class Person.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Person instance = new Person();
        instance.setUsername(username);
    }

    /**
     * Test of setPassword method, of class Person.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Person instance = new Person();
        instance.setPassword(password);
    }

    /**
     * Test of setCustomURL method, of class Person.
     */
    @Test
    public void testSetCustomURL() {
        System.out.println("setCustomURL");
        String customURL = "";
        Person instance = new Person();
        instance.setCustomURL(customURL);
    }

    /**
     * Test of setProfilepic method, of class Person.
     */
    @Test
    public void testSetProfilepic() {
        System.out.println("setProfilepic");
        FileObject profilepic = null;
        Person instance = new Person();
        instance.setProfilepic(profilepic);
    }

    /**
     * Test of setFriends method, of class Person.
     */
    @Test
    public void testSetFriends() {
        System.out.println("setFriends");
        List<Person> friends = null;
        Person instance = new Person();
        instance.setFriends(friends);
    }

    /**
     * Test of setFriendsRequests method, of class Person.
     */
    @Test
    public void testSetFriendsRequests() {
        System.out.println("setFriendsRequests");
        List<Person> friendsRequests = null;
        Person instance = new Person();
        instance.setFriendsRequests(friendsRequests);
    }

    /**
     * Test of setBlocked method, of class Person.
     */
    @Test
    public void testSetBlocked() {
        System.out.println("setBlocked");
        List<Person> blocked = null;
        Person instance = new Person();
        instance.setBlocked(blocked);
    }

    /**
     * Test of setPosts method, of class Person.
     */
    @Test
    public void testSetPosts() {
        System.out.println("setPosts");
        List<Post> posts = null;
        Person instance = new Person();
        instance.setPosts(posts);
    }

    /**
     * Test of equals method, of class Person.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Person instance = new Person();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of canEqual method, of class Person.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        Person instance = new Person();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
    }  
}
