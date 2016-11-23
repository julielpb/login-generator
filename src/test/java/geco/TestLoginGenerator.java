package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by 21301266 on 23/11/2016.
 */
public class TestLoginGenerator {

    LoginService loginService;
    LoginGenerator loginGenerator;

    @Before
    public void setUp(){
        loginService = new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void testDurand(){
        assertEquals("PDUR", loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul"));
        assertTrue(loginService.loginExists("PDUR"));
    }

    @Test
    public void testRolling(){
        assertEquals("JROL1", loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean"));
        assertTrue(loginService.loginExists("JROL1"));
    }

    @Test
    public void testDurand2(){
        assertEquals("PDUR", loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul"));
        assertTrue(loginService.loginExists("PDUR"));
    }

    @Test
    public void testRalling2(){
        assertEquals("JRAL2", loginGenerator.generateLoginForNomAndPrenom("Ralling", "John"));
        assertTrue(loginService.loginExists("JRAL2"));
    }
}
