package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 21301266 on 30/11/2016.
 */
public class TestPasswordGenerator {
    PasswordGeneration log;

    @Before
    public void setUp(){
        log = new PasswordGeneration();
    }

    @Test
    public void testLoginExists(){
        assertEquals(8,log.getRandomPassword().length());
        assertNotEquals(log.getRandomPassword(), log.getRandomPassword());
    }
}
