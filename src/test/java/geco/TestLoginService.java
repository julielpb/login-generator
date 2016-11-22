package geco;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class TestLoginService
{

    LoginService log;

    @Before
    public void setUp(){
        String[] logins = {"login1","login2","login4"};
        log = new LoginService(logins);
    }

    @Test
    public void testLoginExists(){
        assertTrue(log.loginExists("login1"));
        assertFalse(log.loginExists("login3"));
    }

    @Test
    public void testAddLogin(){
        log.addLogin("login3");
        assertTrue(log.loginExists("login3"));
    }

    @Test
    public void testFindAllLoginsStartingWith(){
        log.addLogin("log3");
        ArrayList<String> found = new ArrayList<String>();
        found.add("login1");
        found.add("login2");
        found.add("login4");
        assertEquals(found,log.findAllLoginsStartingWith("login"));
    }

    @Test
    public void testFindAllLogins(){
        ArrayList<String> found = new ArrayList<String>();
        found.add("login1");
        found.add("login2");
        found.add("login4");
        assertEquals(found,log.findAllLogins());
    }

}
