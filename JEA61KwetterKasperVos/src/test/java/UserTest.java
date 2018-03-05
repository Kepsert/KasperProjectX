/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Kweet;
import domain.User;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kasper
 */
public class UserTest {

    private User user1;
    private User user2;

    public UserTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        user1 = new User("Kasper", "Kasper");
        user2 = new User("Test", "Test");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetKweet() {
        System.out.println("Test getKweets");
        Kweet k = new Kweet();
        k.setMessage(("This is a test Kweet"));
        user1.addKweet(k);

        List<Kweet> expResult = new ArrayList();
        expResult.add(k);

        List<Kweet> result = user1.getKweets();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTweets() {
        System.out.println("Test setTweets");
        List<Kweet> kweets = new ArrayList();
        Kweet kw = new Kweet();
        kw.setMessage("TestKweet 1");

        Kweet kw2 = new Kweet();
        kw.setMessage("TestKweet 2");
        kweets.add(kw);
        kweets.add(kw2);
        user1.setKweets(kweets);
        assertEquals(2, kweets.size());
    }

    @Test
    public void testGetName() {
        System.out.println("Test getName");
        String expResult = "Kasper";
        String result = user1.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        System.out.println("Test setName");
        String expResult = "Kasper";
        user2.setName(user1.getName());
        String result = user2.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testFollowUser() {
        System.out.println("Test followUser");
        user2.followUser(user1);
        assertEquals(1, user2.getFollowingList().size());
    }

    @Test
    public void testUnfollowUser() {
        System.out.println("Test unfollowUser");
        user2.followUser(user1);
        assertEquals(1, user2.getFollowingList().size());
        
        user2.unfollowUser(user1);
        assertEquals(0, user2.getFollowingList().size());
    }
}
