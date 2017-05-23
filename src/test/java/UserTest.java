import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by aman on 5/22/17.
 */
public class UserTest {
    User user = new User("ram");


    @Test
    public void getName() throws Exception {

        assertEquals("ram", user.getName());

    }

    @Ignore("exception not set")
    @Test
    public void happy() throws Exception {
        assertFalse(user.isHappy());
    }

    @Test(expected = IllegalStateException.class)
    public void nameFail() throws Exception {
        user.printHappyMsg();
    }

    @Before
    public void before() throws Exception {
        System.out.println("before");
    }

    @After
    public void after() throws Exception {
        System.out.println("after");
    }
}